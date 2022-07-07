package com.springboot.data.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.data.rest.model.Book;
import com.springboot.data.rest.repository.BookRepository;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {
		@Autowired
		private BookRepository bookRepository;
	public static void main(String[] args)  {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book firstBook = new Book();
		firstBook.setBookTitle("O'Reilly Java");
		firstBook.setBookAuthor("Kathy Seirra");
		firstBook.setBookContent("Java Complete Guide");
		firstBook.setBookpages(400);
		
		Book secondBook  = new Book();
		secondBook.setBookAuthor("Khalid A Mughal");
		secondBook.setBookTitle("OCJP/SCJP");
		secondBook.setBookContent("Competitive Java");
		secondBook.setBookpages(500);
		
		List<Book> books = new ArrayList<>();
		books.add(firstBook);
		books.add(secondBook);
		
		this.bookRepository.saveAll(books);
		
	}

}
