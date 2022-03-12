package com.example.Library_Management_System.pojo;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid")
    private int bid;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_publisher")
    private String bookPublisher;
    @Column(name = "book_edition")
    private String bookEdition;
    @Column(name = "book_price")
    private int bookPrice;
    @Column(name = "book_pages")
    private int bookPages;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bid=" + bid +
                ", bookName='" + bookName + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                ", bookEdition='" + bookEdition + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookPages=" + bookPages +
                '}';
    }
}
