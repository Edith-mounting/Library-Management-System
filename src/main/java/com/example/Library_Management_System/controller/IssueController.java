package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.pojo.IssueBook;
import com.example.Library_Management_System.repository.IssueRepository;
import com.example.Library_Management_System.request.IssueRequest;
import com.example.Library_Management_System.response.IssueResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class IssueController {
    @Autowired
    private IssueRepository issueRepository;

    @PostMapping("issueBook")
    public IssueResponse issueResponse(@RequestBody IssueRequest issueRequest){
        IssueBook issue = issueRepository.findIssuedBookUsingBid(issueRequest.getBid());
        IssueResponse response = new IssueResponse();
        response.setStatusCode(HttpStatus.BAD_REQUEST.value());
        response.setStatus("Book has been already issued");
        if(issue == null){
            response.setStatusCode(HttpStatus.OK.value());
            response.setStatus("So the book is issued");
            issue = new IssueBook();
            issue.setIssueDate(currentDate());
            issue.setBid(issueRequest.getBid());
            issue.setUid(issueRequest.getUid());
            IssueBook issue1 = issueRepository.save(issue);
            response.setIid(issue1.getIid());
        }
        return response;
    }
    String currentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
