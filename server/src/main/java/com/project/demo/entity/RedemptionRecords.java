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
 * 兑换记录：(RedemptionRecords)表实体类
 *
 */
@TableName("`redemption_records`")
@Data
@EqualsAndHashCode(callSuper = false)
public class RedemptionRecords implements Serializable {

    // RedemptionRecords编号
    @TableId(value = "redemption_records_id", type = IdType.AUTO)
    private Integer redemption_records_id;

    // 兑换号
    @TableField(value = "`exchange_number`")
    private String exchange_number;
    // 商品编号
    @TableField(value = "`product_number`")
    private String product_number;
    // 商品名称
    @TableField(value = "`product_name`")
    private String product_name;
    // 商品类型
    @TableField(value = "`product_type`")
    private String product_type;
    // 商品规格
    @TableField(value = "`product_specifications`")
    private String product_specifications;
    // 所需积分
    @TableField(value = "`required_points`")
    private Integer required_points;
    // 兑换日期
    @TableField(value = "`redemption_date`")
    private Timestamp redemption_date;
    // 普通用户
    @TableField(value = "`ordinary_users`")
    private Integer ordinary_users;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;






    @TableField(value = "user_id")
    private Integer user_id;

}
