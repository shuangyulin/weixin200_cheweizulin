package com.entity.model;

import com.entity.TichushenshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 提出申述
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TichushenshuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申诉问题
     */
    private String cheweiName;


    /**
     * 申述原因
     */
    private Integer tichushenshuTypes;


    /**
     * 申述结果
     */
    private Integer tichushenshuStatusTypes;


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
	 * 获取：申诉问题
	 */
    public String getCheweiName() {
        return cheweiName;
    }


    /**
	 * 设置：申诉问题
	 */
    public void setCheweiName(String cheweiName) {
        this.cheweiName = cheweiName;
    }
    /**
	 * 获取：申述原因
	 */
    public Integer getTichushenshuTypes() {
        return tichushenshuTypes;
    }


    /**
	 * 设置：申述原因
	 */
    public void setTichushenshuTypes(Integer tichushenshuTypes) {
        this.tichushenshuTypes = tichushenshuTypes;
    }
    /**
	 * 获取：申述结果
	 */
    public Integer getTichushenshuStatusTypes() {
        return tichushenshuStatusTypes;
    }


    /**
	 * 设置：申述结果
	 */
    public void setTichushenshuStatusTypes(Integer tichushenshuStatusTypes) {
        this.tichushenshuStatusTypes = tichushenshuStatusTypes;
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
