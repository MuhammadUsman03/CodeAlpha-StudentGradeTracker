package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentGradeTracker {
    private ArrayList<Double> grades;
    public StudentGradeTracker() {
        this.grades = new ArrayList<>();
    }
    public void addGrade(double grade) {
        grades.add(grade);
    }
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public double findHighestGrade() {
        double highest = Double.MIN_VALUE;
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    public double findLowestGrade() {
        double lowest = Double.MAX_VALUE;
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentGradeTracker calculator = new StudentGradeTracker();
        System.out.println("Enter students' grades (enter -1 to finish):");

            // Read grades from the user
        while (true) {
            double grade = sc.nextDouble();
            if (grade == -1) {
                break;
            }
            calculator.addGrade(grade);
        }

            // Calculate results
        double average = calculator.calculateAverage();
        double highest = calculator.findHighestGrade();
        double lowest = calculator.findLowestGrade();

            // Display results
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        sc.close();
    }
}

