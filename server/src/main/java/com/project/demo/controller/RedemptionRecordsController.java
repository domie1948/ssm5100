package com.project.demo.controller;

import com.project.demo.entity.RedemptionRecords;
import com.project.demo.service.RedemptionRecordsService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 兑换记录：(RedemptionRecords)表控制层
 *
 */
@RestController
@RequestMapping("/redemption_records")
public class RedemptionRecordsController extends BaseController<RedemptionRecords, RedemptionRecordsService> {

    /**
     * 兑换记录对象
     */
    @Autowired
    public RedemptionRecordsController(RedemptionRecordsService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(redemption_records_id) AS max FROM "+"redemption_records";
        Integer max = service.selectBaseCount(sql);
        sql = ("SELECT count(*) count FROM `user_points` INNER JOIN `redemption_records` ON user_points.ordinary_users=redemption_records.ordinary_users WHERE user_points.total_points < redemption_records.required_points AND redemption_records.redemption_records_id="+max).replaceAll("&#60;","<");
        Integer count = service.selectBaseCount(sql);
        if(count>0){
            sql = "delete from "+"redemption_records"+" WHERE "+"redemption_records_id"+" ="+max;
            service.deleteBaseSql(sql);
            return error(30000,"用户积分总数不足！兑换失败。");
        }
        sql = "UPDATE `user_points` INNER JOIN `redemption_records` ON user_points.ordinary_users=redemption_records.ordinary_users SET user_points.total_points= user_points.total_points - redemption_records.required_points WHERE redemption_records.redemption_records_id="+max;
        service.updateBaseSql(sql);
        return success(1);
    }

}
