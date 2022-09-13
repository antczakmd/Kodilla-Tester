package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jan Dąb", new Teacher("Maciej Kot")));
        studentList.add(new Student("Tomasz Bąk", new Teacher("Olaf Pająk")));
        studentList.add(new Student("Paweł Lis", null));
        studentList.add(new Student("Ola Pszczoła", null));

        for(Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + student.getName() + " Teacher: " + teacher);
        }
    }
}
