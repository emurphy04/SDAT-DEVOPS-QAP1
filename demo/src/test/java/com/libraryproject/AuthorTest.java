package com.libraryproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuthorTest {

    @Test
    public void testConstructorAndToString() {
        Author author = new Author("Ethan Murphy", "May 6th 2004", "several books");
        String expected = "Ethan Murphy, born on May 6th 2004, writer of several books";
        assertEquals(expected, author.toString());
    }

    @Test
    public void testSetters() {
        Author author = new Author("Ethan Murphy", "May 6th 2004", "a few books");
        author.setName("Omar Elfeki");
        author.setDob("July 5th, 2004");
        author.setItems("no books");

        String expected = "Omar Elfeki, born on July 5th, 2004, writer of no books";
        assertEquals(expected, author.toString());
    }
}
