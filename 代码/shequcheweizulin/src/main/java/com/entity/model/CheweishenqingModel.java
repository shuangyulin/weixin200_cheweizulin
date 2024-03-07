package com.entity.model;

import com.entity.CheweishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车位申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheweishenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车位
     */
    private Integer cheweiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 租赁时间
     */
    private Integer cheweishenqingShijian;


    /**
     * 审核结果
     */
    private Integer cheweishenqingYesnoTypes;


    /**
     * 审核原因
     */
    private String cheweishenqingYesnoText;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：车位
	 */
    public Integer getCheweiId() {
        return cheweiId;
    }


    /**
	 * 设置：车位
	 */
    public void setCheweiId(Integer cheweiId) {
        this.cheweiId = cheweiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：租赁时间
	 */
    public Integer getCheweishenqingShijian() {
        return cheweishenqingShijian;
    }


    /**
	 * 设置：租赁时间
	 */
    public void setCheweishenqingShijian(Integer cheweishenqingShijian) {
        this.cheweishenqingShijian = cheweishenqingShijian;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getCheweishenqingYesnoTypes() {
        return cheweishenqingYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setCheweishenqingYesnoTypes(Integer cheweishenqingYesnoTypes) {
        this.cheweishenqingYesnoTypes = cheweishenqingYesnoTypes;
    }
    /**
	 * 获取：审核原因
	 */
    public String getCheweishenqingYesnoText() {
        return cheweishenqingYesnoText;
    }


    /**
	 * 设置：审核原因
	 */
    public void setCheweishenqingYesnoText(String cheweishenqingYesnoText) {
        this.cheweishenqingYesnoText = cheweishenqingYesnoText;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
