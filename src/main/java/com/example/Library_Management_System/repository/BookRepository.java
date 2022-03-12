package com.example.Library_Management_System.repository;

import com.example.Library_Management_System.pojo.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {
}
