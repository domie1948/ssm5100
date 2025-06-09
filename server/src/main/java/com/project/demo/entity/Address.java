package com.project.demo.entity;


import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 收货地址：(Address)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("address")
@Data
@EqualsAndHashCode(callSuper = false)
public class Address implements Serializable {

    private static final long serialVersionUID = -43117653992759254L;

    /**
     * 收货地址：
     */
    @TableId(value = "address_id", type = IdType.AUTO)
    private Integer addressId;

    /**
     * 姓名：
     */
    @TableField(value = "name")
    private String name;

    /**
     * 手机：
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 邮编：
     */
    @TableField(value = "postcode")
    private String postcode;

    /**
     * 地址：
     */
    @TableField(value = "address")
    private String address;

    /**
     * 用户ID：[0,8388607]用户获取其他与用户相关的数据
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
     * 默认判断
     */
    @TableField(value = "`default`")
    @JSONField(name = "default")
    private Boolean defaults;

}

