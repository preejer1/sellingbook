package com.maplesyrup.sellingbook.dao.book.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.maplesyrup.sellingbook.dao.book.BookDao;
import com.maplesyrup.sellingbook.domain.book.Book;

@Repository
public class BookDaoImpl implements BookDao {

	
	@Autowired
	private SqlSession sqlSession;
	
	public BookDaoImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void insert(Book book) {
		sqlSession.insert("bookmapper.insert", book);
	}

}
