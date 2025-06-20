package com.entity.model;

import com.entity.GongyixianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工艺线路
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public class GongyixianluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 产品类型
	 */
	
	private String chanpinleixing;
		
	/**
	 * 工艺名称
	 */
	
	private String gongyimingcheng;
		
	/**
	 * 加工原料
	 */
	
	private String jiagongyuanliao;
		
	/**
	 * 工艺流程
	 */
	
	private String gongyiliucheng;
		
	/**
	 * 工作原理
	 */
	
	private String gongzuoyuanli;
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：产品类型
	 */
	 
	public void setChanpinleixing(String chanpinleixing) {
		this.chanpinleixing = chanpinleixing;
	}
	
	/**
	 * 获取：产品类型
	 */
	public String getChanpinleixing() {
		return chanpinleixing;
	}
				
	
	/**
	 * 设置：工艺名称
	 */
	 
	public void setGongyimingcheng(String gongyimingcheng) {
		this.gongyimingcheng = gongyimingcheng;
	}
	
	/**
	 * 获取：工艺名称
	 */
	public String getGongyimingcheng() {
		return gongyimingcheng;
	}
				
	
	/**
	 * 设置：加工原料
	 */
	 
	public void setJiagongyuanliao(String jiagongyuanliao) {
		this.jiagongyuanliao = jiagongyuanliao;
	}
	
	/**
	 * 获取：加工原料
	 */
	public String getJiagongyuanliao() {
		return jiagongyuanliao;
	}
				
	
	/**
	 * 设置：工艺流程
	 */
	 
	public void setGongyiliucheng(String gongyiliucheng) {
		this.gongyiliucheng = gongyiliucheng;
	}
	
	/**
	 * 获取：工艺流程
	 */
	public String getGongyiliucheng() {
		return gongyiliucheng;
	}
				
	
	/**
	 * 设置：工作原理
	 */
	 
	public void setGongzuoyuanli(String gongzuoyuanli) {
		this.gongzuoyuanli = gongzuoyuanli;
	}
	
	/**
	 * 获取：工作原理
	 */
	public String getGongzuoyuanli() {
		return gongzuoyuanli;
	}
			
}
