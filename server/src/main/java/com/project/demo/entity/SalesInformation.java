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
 * 销售信息：(SalesInformation)表实体类
 *
 */
@TableName("`sales_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SalesInformation implements Serializable {

    // SalesInformation编号
    @TableId(value = "sales_information_id", type = IdType.AUTO)
    private Integer sales_information_id;

    // 商品类型
    @TableField(value = "`product_type`")
    private String product_type;
    // 销售日期
    @TableField(value = "`sales_date`")
    private Timestamp sales_date;
    // 销售金额
    @TableField(value = "`sales_amount`")
    private Integer sales_amount;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
