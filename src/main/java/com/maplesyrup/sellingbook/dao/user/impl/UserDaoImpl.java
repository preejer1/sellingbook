package com.maplesyrup.sellingbook.dao.user.impl;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maplesyrup.sellingbook.dao.user.UserDao;
import com.maplesyrup.sellingbook.domain.user.User;

@Repository
public class UserDaoImpl implements UserDao{

	
	@Autowired
	private SqlSession sqlSession;
	
	public UserDaoImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void insert(User user) throws SQLException {
		sqlSession.insert("usermapper.insert", user);
	}

}
