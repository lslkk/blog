/**  
 * @Title:  ResponseUtils.java   
 * @Package org.lsliang.common.util   
 * @author: 我长不高了    
 * @date: 2019年1月12日 下午4:38:57   
 * @version 1.0.0 
 */
package org.lsliang.common.util;

import org.lsliang.common.enumerate.ResponseEnum;
import org.lsliang.common.model.ResponseVO;

/**
 **************************************************
 * @Description 响应工具类
 * 
 * @version 1.0.0
 * @author lsliang
 **************************************************
 */
public final class ResponseUtils {

	private ResponseUtils() {
		super();
	}

	/**
	 * @Title success
	 * @Description 响应成功 包含数据
	 * @param data 响应数据
	 * @return ResponseVO
	 * @since 1.0.0
	 * @author lsliang 2019年1月12日 创建方法
	 */
	public static <T> ResponseVO<T> success(T data) {
		return new ResponseVO.Builder<T>().responseEnum(ResponseEnum.SUCCESS).data(data).builder();
	}

	/**
	 * @Title success
	 * @Description 响应成功 无数据返回
	 * @return ResponseVO
	 * @since 1.0.0
	 * @author lsliang 2019年1月12日 创建方法
	 */
	public static <T> ResponseVO<T> success() {
		return new ResponseVO.Builder<T>().responseEnum(ResponseEnum.SUCCESS).builder();
	}

	/**
	 * @Title error
	 * @Description 响应失败 包含错误枚举
	 * @param 错误枚举
	 * @return ResponseVO
	 * @since 1.0.0
	 * @author lsliang 2019年1月12日 创建方法
	 */
	public static <T> ResponseVO<T> error(ResponseEnum responseEnum) {
		return new ResponseVO.Builder<T>().responseEnum(responseEnum).builder();
	}

	/**
	 * @Title error
	 * @Description 响应失败 包含错误码和错误信息
	 * @param code 错误码
	 * @param msg  错误信息
	 * @return ResponseVO
	 * @since 1.0.0
	 * @author lsliang 2019年1月12日 创建方法
	 */
	public static <T> ResponseVO<T> error(Integer code, String msg) {
		return new ResponseVO.Builder<T>().code(code).msg(msg).builder();
	}
}
