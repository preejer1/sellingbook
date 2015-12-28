package com.maplesyrup.sellingbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maplesyrup.sellingbook.domain.book.Book;
import com.maplesyrup.sellingbook.service.book.BookService;

@Controller
public class BookController {
	
	@Autowired
	@Qualifier("bookServiceImpl")
	private BookService bookService;

	public BookController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping("insert")
	public String insertBook(@ModelAttribute Book book){
		bookService.insert(book);
		return "";
	}
	
}
