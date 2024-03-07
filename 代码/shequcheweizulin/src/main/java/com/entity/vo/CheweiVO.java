package com.entity.vo;

import com.entity.CheweiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车位信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chewei")
public class CheweiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 车位地址
     */

    @TableField(value = "chewei_name")
    private String cheweiName;


    /**
     * 车位图片
     */

    @TableField(value = "chewei_photo")
    private String cheweiPhoto;


    /**
     * 车位类型
     */

    @TableField(value = "chewei_types")
    private Integer cheweiTypes;


    /**
     * 车位数量
     */

    @TableField(value = "chewei_number")
    private Integer cheweiNumber;


    /**
     * 车位价格(月)
     */

    @TableField(value = "chewei_jiage")
    private Double cheweiJiage;


    /**
     * 车位详情
     */

    @TableField(value = "chewei_content")
    private String cheweiContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：车位地址
	 */
    public String getCheweiName() {
        return cheweiName;
    }


    /**
	 * 获取：车位地址
	 */

    public void setCheweiName(String cheweiName) {
        this.cheweiName = cheweiName;
    }
    /**
	 * 设置：车位图片
	 */
    public String getCheweiPhoto() {
        return cheweiPhoto;
    }


    /**
	 * 获取：车位图片
	 */

    public void setCheweiPhoto(String cheweiPhoto) {
        this.cheweiPhoto = cheweiPhoto;
    }
    /**
	 * 设置：车位类型
	 */
    public Integer getCheweiTypes() {
        return cheweiTypes;
    }


    /**
	 * 获取：车位类型
	 */

    public void setCheweiTypes(Integer cheweiTypes) {
        this.cheweiTypes = cheweiTypes;
    }
    /**
	 * 设置：车位数量
	 */
    public Integer getCheweiNumber() {
        return cheweiNumber;
    }


    /**
	 * 获取：车位数量
	 */

    public void setCheweiNumber(Integer cheweiNumber) {
        this.cheweiNumber = cheweiNumber;
    }
    /**
	 * 设置：车位价格(月)
	 */
    public Double getCheweiJiage() {
        return cheweiJiage;
    }


    /**
	 * 获取：车位价格(月)
	 */

    public void setCheweiJiage(Double cheweiJiage) {
        this.cheweiJiage = cheweiJiage;
    }
    /**
	 * 设置：车位详情
	 */
    public String getCheweiContent() {
        return cheweiContent;
    }


    /**
	 * 获取：车位详情
	 */

    public void setCheweiContent(String cheweiContent) {
        this.cheweiContent = cheweiContent;
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
