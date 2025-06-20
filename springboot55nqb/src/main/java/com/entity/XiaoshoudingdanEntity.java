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
 * 销售订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
@TableName("xiaoshoudingdan")
public class XiaoshoudingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoshoudingdanEntity() {
		
	}
	
	public XiaoshoudingdanEntity(T t) {
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
	 * 销售单号
	 */
					
	private String xiaoshoudanhao;
	
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
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 销售数量
	 */
					
	private Integer xiaoshoushuliang;
	
	/**
	 * 总销售额
	 */
					
	private Integer zongxiaoshoue;
	
	/**
	 * 销售时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xiaoshoushijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 客户名称
	 */
					
	private String kehumingcheng;
	
	/**
	 * 电话
	 */
					
	private String dianhua;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	
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
	 * 设置：销售单号
	 */
	public void setXiaoshoudanhao(String xiaoshoudanhao) {
		this.xiaoshoudanhao = xiaoshoudanhao;
	}
	/**
	 * 获取：销售单号
	 */
	public String getXiaoshoudanhao() {
		return xiaoshoudanhao;
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
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：销售数量
	 */
	public void setXiaoshoushuliang(Integer xiaoshoushuliang) {
		this.xiaoshoushuliang = xiaoshoushuliang;
	}
	/**
	 * 获取：销售数量
	 */
	public Integer getXiaoshoushuliang() {
		return xiaoshoushuliang;
	}
	/**
	 * 设置：总销售额
	 */
	public void setZongxiaoshoue(Integer zongxiaoshoue) {
		this.zongxiaoshoue = zongxiaoshoue;
	}
	/**
	 * 获取：总销售额
	 */
	public Integer getZongxiaoshoue() {
		return zongxiaoshoue;
	}
	/**
	 * 设置：销售时间
	 */
	public void setXiaoshoushijian(Date xiaoshoushijian) {
		this.xiaoshoushijian = xiaoshoushijian;
	}
	/**
	 * 获取：销售时间
	 */
	public Date getXiaoshoushijian() {
		return xiaoshoushijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：客户名称
	 */
	public void setKehumingcheng(String kehumingcheng) {
		this.kehumingcheng = kehumingcheng;
	}
	/**
	 * 获取：客户名称
	 */
	public String getKehumingcheng() {
		return kehumingcheng;
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
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}

}
