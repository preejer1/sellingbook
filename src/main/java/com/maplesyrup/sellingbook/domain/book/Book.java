package com.maplesyrup.sellingbook.domain.book;

public class Book {
	
	private String board_title;
	private String board_content;
	private String book_name;
	private String book_author;
	private String book_publisher;
	private String book_image;
	private int book_condition;
	private int book_price;
	private int book_w_price;
	private String sales;
	private String board_regDate;

	public Book() {
	}

	public Book(String board_title, String board_content, String book_name,
			String book_author, String book_publisher, String book_image,
			int book_condition, int book_price, int book_w_price, String sales,
			String board_regDate) {

		this.board_title = board_title;
		this.board_content = board_content;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_publisher = book_publisher;
		this.book_image = book_image;
		this.book_condition = book_condition;
		this.book_price = book_price;
		this.book_w_price = book_w_price;
		this.sales = sales;
		this.board_regDate = board_regDate;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	public String getBook_image() {
		return book_image;
	}

	public void setBook_image(String book_image) {
		this.book_image = book_image;
	}

	public int getBook_condition() {
		return book_condition;
	}

	public void setBook_condition(int book_condition) {
		this.book_condition = book_condition;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	public int getBook_w_price() {
		return book_w_price;
	}

	public void setBook_w_price(int book_w_price) {
		this.book_w_price = book_w_price;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public String getBoard_regDate() {
		return board_regDate;
	}

	public void setBoard_regDate(String board_regDate) {
		this.board_regDate = board_regDate;
	}
	
	
	

}
