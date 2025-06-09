package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 购物车：(Cart)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("cart")
@Data
@EqualsAndHashCode(callSuper = false)
public class Cart implements Serializable {

    private static final long serialVersionUID = 978169757869945391L;

    /**
     * 购物车ID：
     */
    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    /**
     * 标题：
     */
    @TableField(value = "title")
    private String title;

    /**
     * 图片：
     */
    @TableField(value = "img")
    private String img;

    /**
     * 用户ID：
     */
    @TableField(value = "user_id")
    private Integer userId;

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
     * 状态：使用中，已失效
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 单价：
     */
    @TableField(value = "price")
    private Double price;

    /**
     * 原价：
     */
    @TableField(value = "price_ago")
    private Double priceAgo;

    /**
     * 总价：
     */
    @TableField(value = "price_count")
    private Double priceCount;

    /**
     * 数量：
     */
    @TableField(value = "num")
    private Integer num;

    /**
     * 商品id：[0,8388607]
     */
    @TableField(value = "goods_id")
    private Double goodsId;

    /**
     * 商品分类：
     */
    @TableField(value = "type")
    private String type;

    /**
     * 描述：[0,255]用于产品规格描述
     */
    @TableField(value = "description")
    private String description;

}

