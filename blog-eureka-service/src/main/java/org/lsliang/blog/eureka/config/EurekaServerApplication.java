/**  
 * @Title:  EurekaServerApplication.java   
 * @Package org.lsliang.blog.eureka.config   
 * @author: 我长不高了    
 * @date: 2019年1月13日 下午10:21:23   
 * @version 1.0.0 
 */ 
package org.lsliang.blog.eureka.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 **************************************************
 * @Description 注册中心启动类
 * 
 * @version 1.0.0
 * @author  lsliang
 **************************************************
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerApplication.class).run(args);
	}
}
