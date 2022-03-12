package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.pojo.Books;
import com.example.Library_Management_System.repository.BookRepository;
import com.example.Library_Management_System.request.BookRequest;
import com.example.Library_Management_System.response.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("create/book")
    public BookResponse createBook(@RequestBody BookRequest bookRequest){
        Books book = mappingRequestToUser(bookRequest);
        Books book1 = bookRepository.save(book);
        return mappingRequestToResponse(book1);
    }
    Books mappingRequestToUser(BookRequest bookRequest){
        Books book = new Books();
        book.setBookEdition(bookRequest.getBookEdition());
        book.setBookName(bookRequest.getBookName());
        book.setBookPages(bookRequest.getBookPages());
        book.setBookPrice(bookRequest.getBookPrice());
        book.setBookPublisher(bookRequest.getBookPublisher());
        return book;
    }
    BookResponse mappingRequestToResponse(Books book){
        BookResponse response = new BookResponse();
        response.setBid(book.getBid());
        response.setStatus(HttpStatus.OK.name());
        response.setStatusCode(HttpStatus.OK.value());
        return response;
    }
}
