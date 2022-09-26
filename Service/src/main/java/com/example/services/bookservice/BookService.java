package com.example.services.bookservice;

import com.example.Model.books.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookService  {

    public Book getBookById(Long id);

}
