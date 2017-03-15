package com.lex;

import java.util.ArrayList;

/**
 * Created by alexishennings on 3/12/17.
 */
public class School {
    private String name, name2;
    private int code, code2;
    private ArrayList<String> students, students2;
    private int maxStudents, maxStudents2;
    private String room, room2;

    School(String courseName, int courseCode, int courseMaxStudents, String classRoom, String courseName2,
           int courseCode2, int courseMaxStudents2, String classRoom2) {
        this.name = courseName;
        this.name2 = courseName2;
        this.code = courseCode;
        this.code2 = courseCode2;
        this.students = new ArrayList<String>();
        this.students2 = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.maxStudents2 = courseMaxStudents2;
        this.room = classRoom;
        this.room2 = classRoom2;
    }

    void addStudent(String studentName) {
        students.add(studentName);
    }
    void addStudent2(String studentName2) {
        students2.add(studentName2);
    }

    void writeCourseInfo() {
        System.out.println("Course name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course room is: " + room);
        System.out.println("Students enrolled: ");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled.");
        System.out.println("The max number of students for this course is " + maxStudents);
        int seats = getMaxStudents() - getNumberOfStudents();
        System.out.println("There is " + seats + " seats remaining for this course");

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println();

        System.out.println("Course name: " + name2);
        System.out.println("Course Code: " + code2);
        System.out.println("Course room is: " + room2);
        System.out.println("Students enrolled: ");
        for (String student2 : students2) {
            System.out.println(student2);
        }
        System.out.println("There are " + getNumberOfStudents2() + " students enrolled.");
        System.out.println("The max number of students for this course is " + maxStudents2);
        int seats2 = getMaxStudents2() - getNumberOfStudents2();
        System.out.println("There is " + seats2 + " seats remaining for this course");
    }

    int getNumberOfStudents() {
        return this.students.size();
    }

    int getNumberOfStudents2() {
        return this.students2.size();
    }

    void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println("*Alert* " + studentName + " was un-enrolled from " + this.name + " course");
        } else {
            System.out.println(studentName + " was not found." + this.name);
        }
    }

    public void setClassRoom(String room) {
        this.room = room;
    }

    public void setClassRoom2(String room2) {
        this.room = room2;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getMaxStudents2() {
        return maxStudents2;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public void setMaxStudents2(int maxStudents2) {
        this.maxStudents2 = maxStudents2;
    }

    public int getCode() {
        return code;
    }

    public int getCode2() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCode2(int code2) {
        this.code = code2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName2(String name2) {
        this.name = name2;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public String getClassRoom() {
        return room;
    }

    public String getClassRoom2() {
        return room2;
    }

}