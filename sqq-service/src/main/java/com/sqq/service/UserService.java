/**
 * File Name:UserService.java
 * Date:2018年2月23日下午5:33:12
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.sqq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqq.mapper.UserMapper;
import com.sqq.model.User;
import com.sqq.service.api.IUserService;
import com.sqq.service.base.BaseService;

/**
 * ClassName:UserService Date: 2018年2月23日 下午5:33:12
 * 
 * @author sqq
 * @since JDK 1.8
 */
@Service("userService")
public class UserService extends BaseService implements IUserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserInfo(Integer id) {
		log.info("------------------------service:" + id);
		return userMapper.selectByPrimaryKey(id);
	}
}
