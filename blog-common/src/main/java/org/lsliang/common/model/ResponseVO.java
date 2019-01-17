/**  
 * @Title:  ResponseVO.java   
 * @Package org.lsliang.common.model   
 * @author: 我长不高了    
 * @date: 2019年1月12日 下午4:32:11   
 * @version 1.0.0 
 */
package org.lsliang.common.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.lsliang.common.enumerate.ResponseEnum;

/**
 **************************************************
 * @Description r响应实体类
 * 
 * @version 1.0.0
 * @author lsliang
 **************************************************
 */
public class ResponseVO<T> {

	/**
	 * response code
	 */
	private Integer code;

	/**
	 * error message
	 */
	private String msg;

	/**
	 * response data
	 */
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @Title ResponseVO
	 * @Description 含参的构造函数
	 */
	public ResponseVO(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	/**
	 * @Title ResponseVO
	 * @Description 无参的构造方法
	 */
	public ResponseVO() {
		super();
	}

	/**
	 * 
	 **************************************************
	 * @Description ResponseVO 构建
	 * 
	 * @version 1.0.0
	 * @author lsliang
	 **************************************************
	 */
	public static class Builder<T> {

		private Integer code;

		private String msg;

		private T data;

		public Builder<T> code(Integer code) {
			this.code = code;
			return this;
		}

		public Builder<T> msg(String msg) {
			this.msg = msg;
			return this;
		}

		public Builder<T> data(T data) {
			this.data = data;
			return this;
		}
		
		public Builder<T> responseEnum(ResponseEnum responseEnum) {
			this.code = responseEnum.getCode();
			this.msg = responseEnum.getMsg();
			return this;
		} 

		public ResponseVO<T> builder() {
			return new ResponseVO<T>(code, msg, data);
		}
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
}
