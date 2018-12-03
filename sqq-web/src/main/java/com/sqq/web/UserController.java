/**
 * File Name:UserController.java
 * Date:2018年2月23日下午5:34:33
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.sqq.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sqq.model.User;
import com.sqq.service.api.IUserService;

/**
 * ClassName:UserController Date: 2018年2月23日 下午5:34:33
 * 
 * @author sqq
 * @since JDK 1.8
 */
@RestController
public class UserController {

	private Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private IUserService userService;

	@ResponseBody
	@RequestMapping(value = "getUser/{id}", method = { RequestMethod.POST, RequestMethod.GET })
	public User getUserById(@PathVariable("id") Integer id) {
		log.info("-------------------------------------");
		User user = userService.getUserInfo(id);
		log.info("-----------------------------------" + user);
		return user;
	}
}
