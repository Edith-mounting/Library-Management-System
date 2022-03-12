package com.example.Library_Management_System.repository;

import com.example.Library_Management_System.pojo.ReturnedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnRepository extends JpaRepository<ReturnedBook, Integer> {

}
