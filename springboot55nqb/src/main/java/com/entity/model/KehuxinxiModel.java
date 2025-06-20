package com.entity.model;

import com.entity.KehuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 客户信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public class KehuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户来源
	 */
	
	private String kehulaiyuan;
		
	/**
	 * 行业
	 */
	
	private String xingye;
		
	/**
	 * 国家地区
	 */
	
	private String guojiadiqu;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 客户等级
	 */
	
	private String kehudengji;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
				
	
	/**
	 * 设置：客户来源
	 */
	 
	public void setKehulaiyuan(String kehulaiyuan) {
		this.kehulaiyuan = kehulaiyuan;
	}
	
	/**
	 * 获取：客户来源
	 */
	public String getKehulaiyuan() {
		return kehulaiyuan;
	}
				
	
	/**
	 * 设置：行业
	 */
	 
	public void setXingye(String xingye) {
		this.xingye = xingye;
	}
	
	/**
	 * 获取：行业
	 */
	public String getXingye() {
		return xingye;
	}
				
	
	/**
	 * 设置：国家地区
	 */
	 
	public void setGuojiadiqu(String guojiadiqu) {
		this.guojiadiqu = guojiadiqu;
	}
	
	/**
	 * 获取：国家地区
	 */
	public String getGuojiadiqu() {
		return guojiadiqu;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：客户等级
	 */
	 
	public void setKehudengji(String kehudengji) {
		this.kehudengji = kehudengji;
	}
	
	/**
	 * 获取：客户等级
	 */
	public String getKehudengji() {
		return kehudengji;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
			
}
