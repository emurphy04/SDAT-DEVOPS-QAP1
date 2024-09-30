package com.libraryproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PatronTest {

    @Test
    public void testConstructorAndToString() {
        // Test constructor and toString method for an employee
        Patron employee = new Patron("Ethan Murphy", "3 Bridgewater Place", "7097691057", true);
        String expectedEmployee = "Ethan Murphy is an employee, | 7097691057 | 3 Bridgewater Place | Borrowed: ";
        assertEquals(expectedEmployee, employee.toString());

        // Test constructor and toString method for a student
        Patron student = new Patron("Omar Elfeki", "9 Sheppards Place", "1234567890", false);
        String expectedStudent = "Omar Elfeki is a student, | 1234567890 | 9 Sheppards Place | Borrowed: ";
        assertEquals(expectedStudent, student.toString());
    }

    @Test
    public void testSettersAndAddToList() {
        // Test setting fields and adding to the list
        Patron patron = new Patron("Omar Elfeki", "9 Sheppards Place", "1234567890", false);
        patron.setName("Tyra White");
        patron.setAddress("10 Hawker Cres");
        patron.setPhone("7096313003");
        patron.setIsEmployee(true);
        patron.addToList("Hunger Games");

        String expected = "Tyra White is an employee, | 7096313003 | 10 Hawker Cres | Borrowed x: , Hunger Games";
        assertEquals(expected, patron.toString());

        // Test adding multiple items to the list
        patron.addToList("Harry Potter");
        expected = "Tyra White is an employee, | 7096313003 | 10 Hawker Cres | Borrowed x: , Hunger Games, Harry Potter";
        assertEquals(expected, patron.toString());
    }
}
