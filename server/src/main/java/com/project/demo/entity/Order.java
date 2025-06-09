package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 订单：(Order)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("`order`")
@Data
@EqualsAndHashCode(callSuper = false)
public class Order implements Serializable {

    private static final long serialVersionUID = -79265503181582181L;

    /**
     * 订单ID：
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    /**
     * 订单号：
     */
    @TableField(value = "order_number")
    private String orderNumber;

    /**
     * 商品id：[0,8388607]
     */
    @TableField(value = "goods_id")
    private Double goodsId;

    /**
     * 商品标题：
     */
    @TableField(value = "title")
    private String title;

    /**
     * 商品图片：
     */
    @TableField(value = "img")
    private String img;

    /**
     * 价格：
     */
    @TableField(value = "price")
    private Double price;

    /**
     * 原价：
     */
    @TableField(value = "price_ago")
    private Double priceAgo;

    /**
     * 数量：
     */
    @TableField(value = "num")
    private Integer num;

    /**
     * 总价：
     */
    @TableField(value = "price_count")
    private Double priceCount;

    /**
     * 规格：
     */
    @TableField(value = "norms")
    private String norms;

    /**
     * 商品分类：
     */
    @TableField(value = "type")
    private String type;

    /**
     * 联系人姓名：
     */
    @TableField(value = "contact_name")
    private String contactName;

    /**
     * 联系人邮箱：
     */
    @TableField(value = "contact_email")
    private String contactEmail;

    /**
     * 联系人手机：
     */
    @TableField(value = "contact_phone")
    private String contactPhone;

    /**
     * 收件地址：
     */
    @TableField(value = "contact_address")
    private String contactAddress;

    /**
     * 邮政编码：
     */
    @TableField(value = "postal_code")
    private String postalCode;

    /**
     * 买家ID：
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 商家ID：
     */
    @TableField(value = "merchant_id")
    private Integer merchantId;

    /**
     * 创建时间：
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */
    @TableField(value = "update_time")
    private Timestamp updateTime;

    /**
     * 描述：[0,255]用于产品规格描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 订单状态：待付款，待发货，待签收，已签收，待退款，已退款，已拒绝，已完成
     */
    @TableField(value = "state")
    private String state;

}

