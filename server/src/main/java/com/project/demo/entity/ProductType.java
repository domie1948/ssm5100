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
 * 商品类型：(ProductType)表实体类
 *
 */
@TableName("`product_type`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductType implements Serializable {

    // ProductType编号
    @TableId(value = "product_type_id", type = IdType.AUTO)
    private Integer product_type_id;

    // 商品类型
    @TableField(value = "`product_type`")
    private String product_type;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
