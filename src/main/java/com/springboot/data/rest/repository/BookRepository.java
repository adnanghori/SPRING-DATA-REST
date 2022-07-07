package com.springboot.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.data.rest.model.Book;
@RepositoryRestResource(path = "books",collectionResourceRel = "book")
public interface BookRepository extends JpaRepository<Book, Integer> {	

		
}
