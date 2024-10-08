package com.libraryproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void testConstructorAndToString() {
        Book book = new Book("1111", "Book", "Author", "1234567890", "Publisher", 2, "Printed");
        String expected = "Department: Books | Book by Author | ISBN: 1234567890 | Publisher: Publisher | ID: 1111 | Amount: 2 | Form Factor: Printed";
        assertEquals(expected, book.toString());
    }
}

