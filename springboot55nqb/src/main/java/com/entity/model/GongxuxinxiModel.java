package com.entity.model;

import com.entity.GongxuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工序信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public class GongxuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工序类型
	 */
	
	private String gongxuleixing;
		
	/**
	 * 工序时长
	 */
	
	private String gongxushizhang;
		
	/**
	 * 操作流程
	 */
	
	private String caozuoliucheng;
		
	/**
	 * 工序附件
	 */
	
	private String gongxufujian;
		
	/**
	 * 适用机器
	 */
	
	private String shiyongjiqi;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
				
	
	/**
	 * 设置：工序类型
	 */
	 
	public void setGongxuleixing(String gongxuleixing) {
		this.gongxuleixing = gongxuleixing;
	}
	
	/**
	 * 获取：工序类型
	 */
	public String getGongxuleixing() {
		return gongxuleixing;
	}
				
	
	/**
	 * 设置：工序时长
	 */
	 
	public void setGongxushizhang(String gongxushizhang) {
		this.gongxushizhang = gongxushizhang;
	}
	
	/**
	 * 获取：工序时长
	 */
	public String getGongxushizhang() {
		return gongxushizhang;
	}
				
	
	/**
	 * 设置：操作流程
	 */
	 
	public void setCaozuoliucheng(String caozuoliucheng) {
		this.caozuoliucheng = caozuoliucheng;
	}
	
	/**
	 * 获取：操作流程
	 */
	public String getCaozuoliucheng() {
		return caozuoliucheng;
	}
				
	
	/**
	 * 设置：工序附件
	 */
	 
	public void setGongxufujian(String gongxufujian) {
		this.gongxufujian = gongxufujian;
	}
	
	/**
	 * 获取：工序附件
	 */
	public String getGongxufujian() {
		return gongxufujian;
	}
				
	
	/**
	 * 设置：适用机器
	 */
	 
	public void setShiyongjiqi(String shiyongjiqi) {
		this.shiyongjiqi = shiyongjiqi;
	}
	
	/**
	 * 获取：适用机器
	 */
	public String getShiyongjiqi() {
		return shiyongjiqi;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
			
}
