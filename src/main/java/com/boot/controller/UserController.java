package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dao.UserMapper;
import com.boot.model.User;
import com.boot.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "cs")
    public User cs() {
		long start = System.currentTimeMillis();
        //调用dao层
        User user = userService.select("wp");
        System.out.println("用时:" + (System.currentTimeMillis() - start) + "ms");
        return user;
    }
	
	@RequestMapping(value = "/index")
	public String toIndex() {
		return "myIndex";
	}
}
