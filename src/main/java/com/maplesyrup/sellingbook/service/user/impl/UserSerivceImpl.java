package com.maplesyrup.sellingbook.service.user.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maplesyrup.sellingbook.dao.user.impl.UserDaoImpl;
import com.maplesyrup.sellingbook.domain.user.User;
import com.maplesyrup.sellingbook.service.user.UserService;

@Service
public class UserSerivceImpl implements UserService{

	@Autowired
	private UserDaoImpl userDaoImpl;
	
	public UserSerivceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void insert(User user) throws SQLException {
		userDaoImpl.insert(user);
	}
	
}
