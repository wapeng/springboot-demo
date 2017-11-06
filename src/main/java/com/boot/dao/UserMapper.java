package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.boot.model.User;

@Mapper
@Repository
public interface UserMapper {

	User selectUserByName(String name);
}
