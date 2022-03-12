package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.pojo.Books;
import com.example.Library_Management_System.pojo.IssueBook;
import com.example.Library_Management_System.pojo.ReturnedBook;
import com.example.Library_Management_System.repository.IssueRepository;
import com.example.Library_Management_System.repository.ReturnRepository;
import com.example.Library_Management_System.request.BookRequest;
import com.example.Library_Management_System.request.ReturnRequest;
import com.example.Library_Management_System.response.BookResponse;
import com.example.Library_Management_System.response.ReturnResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ReturnController {

    @Autowired
    private ReturnRepository returnRepository;

    @Autowired
    private IssueRepository issueRepository;

    @PostMapping("returnBook")
    public ReturnResponse returnResponseResponse(@RequestBody ReturnRequest returnRequest){
        // check if there exists a book with bid in IssueBook or not , if it does then it's okk and if not then return response Accordingly
        IssueBook book = issueRepository.findIssuedBookUsingBid(returnRequest.getBid());
        ReturnResponse returnResponse = new ReturnResponse();
        returnResponse.setCode(HttpStatus.BAD_REQUEST.value());
        returnResponse.setStatusCode("Book have not been issued");
        if(book != null){
            returnResponse.setCode(HttpStatus.OK.value());
            returnResponse.setStatusCode("Book is returned");
            issueRepository.deleteById(book.getIid());
            ReturnedBook book1 = new ReturnedBook();
            book1.setUid(book.getUid());
            book1.setBid(book.getBid());
            book1.setReturnDate(currentDate());
            ReturnedBook returnedBook = returnRepository.save(book1);
            returnResponse.setRid(returnedBook.getRid());
        }
        return returnResponse;
    }
    ReturnedBook mapFromReturnRequestToBook(ReturnRequest returnRequest){
        ReturnedBook returnedBook = null;
        returnedBook.setBid(returnRequest.getBid());
        returnedBook.setUid(returnRequest.getUid());
        returnedBook.setReturnDate(currentDate());
        return returnedBook;
    }
    String currentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
