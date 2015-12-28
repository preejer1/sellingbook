package com.maplesyrup.sellingbook.service.book.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.maplesyrup.sellingbook.dao.book.impl.BookDaoImpl;
import com.maplesyrup.sellingbook.domain.book.Book;
import com.maplesyrup.sellingbook.service.book.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDaoImpl bookDaoImpl;
	
	public BookServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void insert(Book book) {
		bookDaoImpl.insert(book);
	}

}
