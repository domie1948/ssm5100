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
 * 发货通知：(ShippingNotice)表实体类
 *
 */
@TableName("`shipping_notice`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ShippingNotice implements Serializable {

    // ShippingNotice编号
    @TableId(value = "shipping_notice_id", type = IdType.AUTO)
    private Integer shipping_notice_id;

    // 发货号
    @TableField(value = "`shipment_number`")
    private String shipment_number;
    // 普通用户
    @TableField(value = "`ordinary_users`")
    private Integer ordinary_users;
    // 商品名称
    @TableField(value = "`product_name`")
    private String product_name;
    // 所获积分
    @TableField(value = "`points_earned`")
    private Integer points_earned;
    // 发货图片
    @TableField(value = "`shipping_image`")
    private String shipping_image;
    // 发货日期
    @TableField(value = "`the_date_of_issuance`")
    private Timestamp the_date_of_issuance;
    // 发货备注
    @TableField(value = "`shipping_remarks`")
    private String shipping_remarks;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
