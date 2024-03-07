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
 * 提出申述
 *
 * @author 
 * @email
 */
@TableName("tichushenshu")
public class TichushenshuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TichushenshuEntity() {

	}

	public TichushenshuEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申诉问题
     */
    @TableField(value = "chewei_name")

    private String cheweiName;


    /**
     * 申述原因
     */
    @TableField(value = "tichushenshu_types")

    private Integer tichushenshuTypes;


    /**
     * 申述结果
     */
    @TableField(value = "tichushenshu_status_types")

    private Integer tichushenshuStatusTypes;


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
	 * 设置：申诉问题
	 */
    public String getCheweiName() {
        return cheweiName;
    }


    /**
	 * 获取：申诉问题
	 */

    public void setCheweiName(String cheweiName) {
        this.cheweiName = cheweiName;
    }
    /**
	 * 设置：申述原因
	 */
    public Integer getTichushenshuTypes() {
        return tichushenshuTypes;
    }


    /**
	 * 获取：申述原因
	 */

    public void setTichushenshuTypes(Integer tichushenshuTypes) {
        this.tichushenshuTypes = tichushenshuTypes;
    }
    /**
	 * 设置：申述结果
	 */
    public Integer getTichushenshuStatusTypes() {
        return tichushenshuStatusTypes;
    }


    /**
	 * 获取：申述结果
	 */

    public void setTichushenshuStatusTypes(Integer tichushenshuStatusTypes) {
        this.tichushenshuStatusTypes = tichushenshuStatusTypes;
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
        return "Tichushenshu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", cheweiName=" + cheweiName +
            ", tichushenshuTypes=" + tichushenshuTypes +
            ", tichushenshuStatusTypes=" + tichushenshuStatusTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
