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
 * (GoodsType)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("goods_type")
@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsType implements Serializable {

    private static final long serialVersionUID = 154798044277226279L;

    /**
     * 商品分类ID：
     */
    @TableId(value = "type_id", type = IdType.AUTO)
    private Integer typeId;

    /**
     * 上级分类ID：[0,32767]
     */
    @TableField(value = "father_id")
    private Integer fatherId;

    /**
     * 商品名称：
     */
    @TableField(value = "name")
    private String name;

    /**
     * 描述：
     */
    @TableField(value = "`desc`")
    private String desc;

    /**
     * 图标：
     */
    @TableField(value = "icon")
    private String icon;

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
     * 创建时间：
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */
    @TableField(value = "update_time")
    private Timestamp updateTime;

}

