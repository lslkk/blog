/**  
 * @Title:  ResponseEnum.java   
 * @Package org.lsliang.common.constant   
 * @author: 我长不高了    
 * @date: 2019年1月12日 下午5:19:12   
 * @version 1.0.0 
 */ 
package org.lsliang.common.enumerate;

/**
 **************************************************
 * @Description 响应枚举  
 * 
 * @version 1.0.0
 * @author  lsliang
 **************************************************
 */
public enum ResponseEnum {

	/**
	 * 成功
	 */
	SUCCESS(10000, "成功")
	
	;
	
	ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    
    private String msg;

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
