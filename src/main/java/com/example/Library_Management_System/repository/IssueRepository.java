package com.example.Library_Management_System.repository;

import com.example.Library_Management_System.pojo.IssueBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IssueRepository extends JpaRepository<IssueBook, Integer> {
    @Query("SELECT u FROM IssueBook u WHERE bid = :bid")
    IssueBook findIssuedBookUsingBid(@Param("bid") int bid);

//    @Query("DELETE FROM IssueBook u WHERE u.bid = :bid")
//    void deleteIssuedBookUsingBid(@Param("bid") int bid);
}
