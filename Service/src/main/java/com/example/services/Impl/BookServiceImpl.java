package com.example.services.Impl;

import com.example.Model.books.Book;
import com.example.Repositories.bookRepository.BookRepository;
import com.example.services.bookservice.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBookById(Long id) {
        if(bookRepository.findById(id).isPresent())
            return bookRepository.findById(id).get();
        else
            throw new NullPointerException();
    }
}
