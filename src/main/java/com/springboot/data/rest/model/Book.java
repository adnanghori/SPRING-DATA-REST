package com.springboot.data.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	private String bookTitle;
	private String bookContent;
	private String bookAuthor;
	private Integer bookpages;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String bookTitle, String bookContent, String bookAuthor, Integer bookpages) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookContent = bookContent;
		this.bookAuthor = bookAuthor;
		this.bookpages = bookpages;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Integer getBookpages() {
		return bookpages;
	}
	public void setBookpages(Integer bookpages) {
		this.bookpages = bookpages;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookContent=" + bookContent + ", bookAuthor="
				+ bookAuthor + ", bookpages=" + bookpages + "]";
	}
	
	
}
