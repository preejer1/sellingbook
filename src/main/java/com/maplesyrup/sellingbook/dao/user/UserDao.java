package com.maplesyrup.sellingbook.dao.user;

import java.sql.SQLException;

import com.maplesyrup.sellingbook.domain.user.User;

public interface UserDao {

	public void insert(User user) throws SQLException;
}
