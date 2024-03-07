package com.entity.vo;

import com.entity.TichushenshuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 提出申述
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tichushenshu")
public class TichushenshuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
