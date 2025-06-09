package com.project.demo.controller;

import com.project.demo.entity.ShippingNotice;
import com.project.demo.service.ShippingNoticeService;
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
 * 发货通知：(ShippingNotice)表控制层
 *
 */
@RestController
@RequestMapping("/shipping_notice")
public class ShippingNoticeController extends BaseController<ShippingNotice, ShippingNoticeService> {

    /**
     * 发货通知对象
     */
    @Autowired
    public ShippingNoticeController(ShippingNoticeService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(shipping_notice_id) AS max FROM "+"shipping_notice";
        Integer max = service.selectBaseCount(sql);
        sql = "UPDATE `user_points` INNER JOIN `shipping_notice` ON user_points.ordinary_users=shipping_notice.ordinary_users SET user_points.total_points= user_points.total_points + shipping_notice.points_earned WHERE shipping_notice.shipping_notice_id="+max;
        service.updateBaseSql(sql);
        return success(1);
    }

}
