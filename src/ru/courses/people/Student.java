package ru.courses.people;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, Integer... grades) {
        for (int grade : grades) {
            if (isGradeIncorrect(grade)) {
                throw new IllegalArgumentException("Оценки должны быть от 2 до 5");
            }

            this.name = name;
            this.grades = new ArrayList<>(Arrays.asList(grades));
        }
    }

    public void addGrade(int grade) {
        if (isGradeIncorrect(grade)) {
            throw new IllegalArgumentException("Оценки должны быть от 2 до 5");
        }

        grades.add(grade);
    }

    public int[] getGrades() {
        return grades.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, grades.toString());
    }

    private boolean isGradeIncorrect(int grade) {
        return grade < 2 || grade > 5;
    }
}
