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
 * 工艺线路
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
@TableName("gongyixianlu")
public class GongyixianluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongyixianluEntity() {
		
	}
	
	public GongyixianluEntity(T t) {
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
	 * 产品编号
	 */
					
	private String chanpinbianhao;
	
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
	 * 设置：产品编号
	 */
	public void setChanpinbianhao(String chanpinbianhao) {
		this.chanpinbianhao = chanpinbianhao;
	}
	/**
	 * 获取：产品编号
	 */
	public String getChanpinbianhao() {
		return chanpinbianhao;
	}
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
