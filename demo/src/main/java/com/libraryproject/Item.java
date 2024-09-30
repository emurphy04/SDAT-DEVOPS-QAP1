package com.libraryproject;

import java.io.Serializable;

public class Item implements Serializable{
    String id;
    String title;
    String author;
    String ISBN;
    String publisher;
    int amt;
    String formFactor;
    int maxAmt;
    
    public Item(String id, String title, String author, String ISBN, String publisher, int amt){
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.amt = amt;
        this.maxAmt = this.amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void returnBook(int amt){
        this.amt = this.amt + amt;
    }

    public void borrow(int amt){
        this.amt = this.amt - amt;
    }

    @Override
    public String toString() {
        return title+" by "+author+" | ISBN: "+ISBN+" | Publisher: "+publisher+" | ID: "+id+" | Amount: "+amt;
    }
}
