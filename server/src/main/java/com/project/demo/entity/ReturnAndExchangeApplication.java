package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 退换申请：(ReturnAndExchangeApplication)表实体类
 *
 */
@TableName("`return_and_exchange_application`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ReturnAndExchangeApplication implements Serializable {

    // ReturnAndExchangeApplication编号
    @TableId(value = "return_and_exchange_application_id", type = IdType.AUTO)
    private Integer return_and_exchange_application_id;

    // 发货号
    @TableField(value = "`shipment_number`")
    private String shipment_number;
    // 普通用户
    @TableField(value = "`ordinary_users`")
    private Integer ordinary_users;
    // 商品名称
    @TableField(value = "`product_name`")
    private String product_name;
    // 操作日期
    @TableField(value = "`operation_date`")
    private Timestamp operation_date;
    // 退货图片
    @TableField(value = "`return_image`")
    private String return_image;
    // 申请类型
    @TableField(value = "`application_type`")
    private String application_type;
    // 说明原因
    @TableField(value = "`explain_the_reason`")
    private String explain_the_reason;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;



    // 审核回复
    @TableField(value = "examine_reply")
    private String examine_reply;




    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
