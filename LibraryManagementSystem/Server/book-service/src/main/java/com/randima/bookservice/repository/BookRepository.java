package com.randima.bookservice.repository;

import com.randima.bookservice.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {


}
