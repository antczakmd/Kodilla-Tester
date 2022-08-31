package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private String schoolName;
    private List <Integer> students = new ArrayList<>();

    public School(String schoolName, int... students) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();

        for (int number : students) {
            this.students.add(number);
        }
    }

        public int getSum() {
            int sum = 0;
            for (int number : students ) {
                sum += number;
            }
            return sum;
        }


    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) && Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, students);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getStudents() {
        return students;
    }
}
