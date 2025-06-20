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
 * 工序信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
@TableName("gongxuxinxi")
public class GongxuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongxuxinxiEntity() {
		
	}
	
	public GongxuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工序名称
	 */
					
	private String gongxumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工序名称
	 */
	public void setGongxumingcheng(String gongxumingcheng) {
		this.gongxumingcheng = gongxumingcheng;
	}
	/**
	 * 获取：工序名称
	 */
	public String getGongxumingcheng() {
		return gongxumingcheng;
	}
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
