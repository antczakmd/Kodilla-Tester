package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void shouldReturnTeacherName() {
    Student student = new Student("Jan Dąb", new Teacher("Maciej Kot"));
    String teacher = Application.getTeacherName(student);
    assertEquals("Maciej Kot", teacher);
    }
    @Test
    public void shouldReturnUndefined() {
        Student student = new Student("Paweł Lis", null);
        String teacher = Application.getTeacherName(student);
        assertEquals("<undefined>", teacher);


    }

}