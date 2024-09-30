package com.libraryproject;

import java.io.Serializable;

public class Author implements Serializable{
    String name;
    String dob;
    String items;

    public Author(String name, String dob, String items){
        this.name = name;
        this.dob = dob;
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return name+", born on "+dob+", writer of "+items;
    }


}
