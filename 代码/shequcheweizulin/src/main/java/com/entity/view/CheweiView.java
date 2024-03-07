package com.entity.view;

import com.entity.CheweiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 车位信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chewei")
public class CheweiView extends CheweiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 车位类型的值
		*/
		private String cheweiValue;



	public CheweiView() {

	}

	public CheweiView(CheweiEntity cheweiEntity) {
		try {
			BeanUtils.copyProperties(this, cheweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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










}
