package com.sqq.mapper.base;

import com.sqq.model.BaseModel;

public interface BaseMapper<T extends BaseModel> {

	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	int insertSelective(T record);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

	T selectByPrimaryKey(Integer id);

}
