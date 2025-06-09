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
 * 积分商品：(PointProducts)表实体类
 *
 */
@TableName("`point_products`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PointProducts implements Serializable {

    // PointProducts编号
    @TableId(value = "point_products_id", type = IdType.AUTO)
    private Integer point_products_id;

    // 商品编号
    @TableField(value = "`product_number`")
    private String product_number;
    // 商品名称
    @TableField(value = "`product_name`")
    private String product_name;
    // 商品类型
    @TableField(value = "`product_type`")
    private String product_type;
    // 封面
    @TableField(value = "`cover`")
    private String cover;
    // 商品规格
    @TableField(value = "`product_specifications`")
    private String product_specifications;
    // 所需积分
    @TableField(value = "`required_points`")
    private Integer required_points;
    // 商品详情
    @TableField(value = "`product_details`")
    private String product_details;


    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;





    // 限制次数
    @TableField(value = "limit_times")
    private Integer limit_times;

    // 限制次数类型
    @TableField(value = "limit_type")
    private Integer limit_type;


}
