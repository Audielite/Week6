package com.lex;

import java.util.ArrayList;

public class ITECCourses {

    public static void main(String[] args) {
        School maintenanceCourse = new School("Microcomputer Systems Maintenance", 1310, 20,
                "T3400", "Info Tech Concepts", 1100, 30, "T3050");

        ArrayList<School> classInfo = new ArrayList<>();

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Henna");
        maintenanceCourse.addStudent2("Max");
        maintenanceCourse.addStudent2("Nancy");
        maintenanceCourse.addStudent2("Orson");
        maintenanceCourse.setClassRoom("T3400");
        maintenanceCourse.setClassRoom2("T3050");

        maintenanceCourse.removeStudent("Bill");
        System.out.println();

        maintenanceCourse.writeCourseInfo();

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("Course name is " + maintenanceCourse.getName());
        System.out.println("Course code is " + maintenanceCourse.getCode());
        System.out.println("Course room is " + maintenanceCourse.getClassRoom());
        System.out.println("Number of students enrolled is " + maintenanceCourse.getMaxStudents());
        System.out.println("Max students for this class is " + maintenanceCourse.getNumberOfStudents());
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("Course name is " + maintenanceCourse.getName2());
        System.out.println("Course code is " + maintenanceCourse.getCode2());
        System.out.println("Course room is " + maintenanceCourse.getClassRoom2());
        System.out.println("Number of students enrolled is " + maintenanceCourse.getMaxStudents2());
        System.out.println("Max students for this class is " + maintenanceCourse.getNumberOfStudents2());

        maintenanceCourse.setMaxStudents(24);
        System.out.println();
        System.out.println("Max students for this class is now " + maintenanceCourse.getMaxStudents());

        for (School course : classInfo) {
            System.out.println("Name: " + course.getName());
        }

    }
}