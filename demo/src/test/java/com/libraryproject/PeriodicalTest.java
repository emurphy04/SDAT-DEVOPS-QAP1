package com.libraryproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PeriodicalTest {

    @Test
    public void testConstructorAndToString() {
        Periodical periodical = new Periodical("2222", "Periodical", "Author", "987654321", "Publisher", 5, true);
        String expected = "Department: Periodicals | Periodical by Author | ISBN: 987654321 | Publisher: Publisher | ID: 2222 | Amount: 5 | Is Printed?: true";
        assertEquals(expected, periodical.toString());
    }
}

