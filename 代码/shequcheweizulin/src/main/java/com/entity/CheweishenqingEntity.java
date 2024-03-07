package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 车位申请
 *
 * @author 
 * @email
 */
@TableName("cheweishenqing")
public class CheweishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheweishenqingEntity() {

	}

	public CheweishenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车位
     */
    @TableField(value = "chewei_id")

    private Integer cheweiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 租赁时间
     */
    @TableField(value = "cheweishenqing_shijian")

    private Integer cheweishenqingShijian;


    /**
     * 审核结果
     */
    @TableField(value = "cheweishenqing_yesno_types")

    private Integer cheweishenqingYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "cheweishenqing_yesno_text")

    private String cheweishenqingYesnoText;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车位
	 */
    public Integer getCheweiId() {
        return cheweiId;
    }


    /**
	 * 获取：车位
	 */

    public void setCheweiId(Integer cheweiId) {
        this.cheweiId = cheweiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：租赁时间
	 */
    public Integer getCheweishenqingShijian() {
        return cheweishenqingShijian;
    }


    /**
	 * 获取：租赁时间
	 */

    public void setCheweishenqingShijian(Integer cheweishenqingShijian) {
        this.cheweishenqingShijian = cheweishenqingShijian;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getCheweishenqingYesnoTypes() {
        return cheweishenqingYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setCheweishenqingYesnoTypes(Integer cheweishenqingYesnoTypes) {
        this.cheweishenqingYesnoTypes = cheweishenqingYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getCheweishenqingYesnoText() {
        return cheweishenqingYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setCheweishenqingYesnoText(String cheweishenqingYesnoText) {
        this.cheweishenqingYesnoText = cheweishenqingYesnoText;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Cheweishenqing{" +
            "id=" + id +
            ", cheweiId=" + cheweiId +
            ", yonghuId=" + yonghuId +
            ", cheweishenqingShijian=" + cheweishenqingShijian +
            ", cheweishenqingYesnoTypes=" + cheweishenqingYesnoTypes +
            ", cheweishenqingYesnoText=" + cheweishenqingYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
