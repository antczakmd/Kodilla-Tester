package com.kodilla.kodilaintro;

public class Grades {
        private int[] grades;
        private int size;

    public Grades() {
            this.grades = new int[10];
            this.size = 0;
        }

        public void add ( int value){
            if (this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;

        }
        public int theLastOne () {
            return (this.grades[this.size-1]);
        }
        public double averageOfGrades () {

            double suma = 0;
            for (int i = 0; i < grades.length; i++) {
                suma += grades[i];
                System.out.println(suma);
            }
            double average = suma/(size);
            return average;
        }
    }




        





