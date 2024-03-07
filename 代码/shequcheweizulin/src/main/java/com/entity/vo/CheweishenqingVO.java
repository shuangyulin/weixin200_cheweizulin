package com.entity.vo;

import com.entity.CheweishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车位申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cheweishenqing")
public class CheweishenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
