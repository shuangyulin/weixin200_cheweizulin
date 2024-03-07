package com.entity.view;

import com.entity.CheweishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 车位申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cheweishenqing")
public class CheweishenqingView extends CheweishenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核结果的值
		*/
		private String cheweishenqingYesnoValue;



		//级联表 chewei
			/**
			* 车位地址
			*/
			private String cheweiName;
			/**
			* 车位图片
			*/
			private String cheweiPhoto;
			/**
			* 车位类型
			*/
			private Integer cheweiTypes;
				/**
				* 车位类型的值
				*/
				private String cheweiValue;
			/**
			* 车位数量
			*/
			private Integer cheweiNumber;
			/**
			* 车位价格(月)
			*/
			private Double cheweiJiage;
			/**
			* 车位详情
			*/
			private String cheweiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public CheweishenqingView() {

	}

	public CheweishenqingView(CheweishenqingEntity cheweishenqingEntity) {
		try {
			BeanUtils.copyProperties(this, cheweishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核结果的值
			*/
			public String getCheweishenqingYesnoValue() {
				return cheweishenqingYesnoValue;
			}
			/**
			* 设置： 审核结果的值
			*/
			public void setCheweishenqingYesnoValue(String cheweishenqingYesnoValue) {
				this.cheweishenqingYesnoValue = cheweishenqingYesnoValue;
			}




				//级联表的get和set chewei
					/**
					* 获取： 车位地址
					*/
					public String getCheweiName() {
						return cheweiName;
					}
					/**
					* 设置： 车位地址
					*/
					public void setCheweiName(String cheweiName) {
						this.cheweiName = cheweiName;
					}
					/**
					* 获取： 车位图片
					*/
					public String getCheweiPhoto() {
						return cheweiPhoto;
					}
					/**
					* 设置： 车位图片
					*/
					public void setCheweiPhoto(String cheweiPhoto) {
						this.cheweiPhoto = cheweiPhoto;
					}
					/**
					* 获取： 车位类型
					*/
					public Integer getCheweiTypes() {
						return cheweiTypes;
					}
					/**
					* 设置： 车位类型
					*/
					public void setCheweiTypes(Integer cheweiTypes) {
						this.cheweiTypes = cheweiTypes;
					}


						/**
						* 获取： 车位类型的值
						*/
						public String getCheweiValue() {
							return cheweiValue;
						}
						/**
						* 设置： 车位类型的值
						*/
						public void setCheweiValue(String cheweiValue) {
							this.cheweiValue = cheweiValue;
						}
					/**
					* 获取： 车位数量
					*/
					public Integer getCheweiNumber() {
						return cheweiNumber;
					}
					/**
					* 设置： 车位数量
					*/
					public void setCheweiNumber(Integer cheweiNumber) {
						this.cheweiNumber = cheweiNumber;
					}
					/**
					* 获取： 车位价格(月)
					*/
					public Double getCheweiJiage() {
						return cheweiJiage;
					}
					/**
					* 设置： 车位价格(月)
					*/
					public void setCheweiJiage(Double cheweiJiage) {
						this.cheweiJiage = cheweiJiage;
					}
					/**
					* 获取： 车位详情
					*/
					public String getCheweiContent() {
						return cheweiContent;
					}
					/**
					* 设置： 车位详情
					*/
					public void setCheweiContent(String cheweiContent) {
						this.cheweiContent = cheweiContent;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
