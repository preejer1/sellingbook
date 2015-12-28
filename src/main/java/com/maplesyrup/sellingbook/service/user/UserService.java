package com.maplesyrup.sellingbook.service.user;

import java.sql.SQLException;

import com.maplesyrup.sellingbook.domain.user.User;

public interface UserService {
	
	public void insert(User user) throws SQLException;
}
