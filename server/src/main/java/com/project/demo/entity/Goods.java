package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 商品信息：(Goods)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("goods")
@Data
@EqualsAndHashCode(callSuper = false)
public class Goods implements Serializable {

    private static final long serialVersionUID = 352802334662900437L;

    /**
     * 产品id：[0,8388607]
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private Integer goodsId;

    /**
     * 标题：[0,125]用于产品和html的<title>标签中
     */
    @TableField(value = "title")
    private String title;

    /**
     * 封面图：用于显示于产品列表页
     */
    @TableField(value = "img")
    private String img;

    /**
     * 描述：[0,255]用于产品规格描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 原价：[1]
     */
    @TableField(value = "price_ago")
    private Double priceAgo;

    /**
     * 卖价：[1]
     */
    @TableField(value = "price")
    private Double price;

    /**
     * 销量：[0,1000000000]
     */
    @TableField(value = "sales")
    private Integer sales;

    /**
     * 商品库存
     */
    @TableField(value = "inventory")
    private Double inventory;

    /**
     * 商品分类：
     */
    @TableField(value = "type")
    private String type;

    /**
     * 点击量：[0,1000000000]访问这篇产品的人次
     */
    @TableField(value = "hits")
    private Integer hits;

    /**
     * 正文：产品的主体内容
     */
    @TableField(value = "content")
    private String content;

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
     * 主图1：
     */
    @TableField(value = "img_1")
    private String img_1;

    /**
     * 主图2：
     */
    @TableField(value = "img_2")
    private String img_2;

    /**
     * 主图3：
     */
    @TableField(value = "img_3")
    private String img_3;

    /**
     * 主图4：
     */
    @TableField(value = "img_4")
    private String img_4;

    /**
     * 主图5：
     */
    @TableField(value = "img_5")
    private String img_5;

    /**
     * 自定义字段
     */

    @TableField(value = "customize_field")
    private String customize_field;

    /**
     * 来源表：
     */
    @TableField(value = "source_table")
    private String sourceTable;

    /**
     * 来源字段：
     */
    @TableField(value = "source_field")
    private String sourceField;

    /**
     * 来源ID：
     */
    @TableField(value = "source_id")
    private Integer sourceId;

    /**
     * 用户
     */
    @TableField(value = "user_id")
    private Integer user_id;

}

