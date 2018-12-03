/**
 * File Name:IUserService.java
 * Date:2018年2月23日下午5:25:50
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.sqq.service.api;

import com.sqq.model.User;

/**
 * ClassName:IUserService Date: 2018年2月23日 下午5:25:50
 * 
 * @author sqq
 * @since JDK 1.8
 */
public interface IUserService {

	User getUserInfo(Integer id);
}
