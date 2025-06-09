package com.project.demo.controller;

import com.project.demo.entity.ReturnAndExchangeApplication;
import com.project.demo.service.ReturnAndExchangeApplicationService;
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
 * 退换申请：(ReturnAndExchangeApplication)表控制层
 *
 */
@RestController
@RequestMapping("/return_and_exchange_application")
public class ReturnAndExchangeApplicationController extends BaseController<ReturnAndExchangeApplication, ReturnAndExchangeApplicationService> {

    /**
     * 退换申请对象
     */
    @Autowired
    public ReturnAndExchangeApplicationController(ReturnAndExchangeApplicationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapshipment_number = new HashMap<>();
        mapshipment_number.put("shipment_number",String.valueOf(paramMap.get("shipment_number")));
        List listshipment_number = service.selectBaseList(service.select(mapshipment_number, new HashMap<>()));
        if (listshipment_number.size()>0){
            return error(30000, "字段发货号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
