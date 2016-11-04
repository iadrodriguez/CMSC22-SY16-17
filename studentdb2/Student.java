package studentdb2;

import java.io.Serializable;

/**
 * Created by USER on 11/4/2016.
 */
public class Student implements Serializable{

    private String studentNumber;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private String course;
    private int yearLevel;
    private String crushName;
    private Course faveSubj;


    public Student(String studentNumber, String firstName, char middleInitial, String lastName, String course, int yearLevel, String crushName, Course faveSubj) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.crushName = crushName;
        this.faveSubj = faveSubj;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public Course getFaveSubj() {
        return faveSubj;
    }

    public void setFaveSubj(Course faveSubj) {
        this.faveSubj = faveSubj;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getYearLevel() {
        return yearLevel;
    }



    public String toString() {
        return "Student Number: " + studentNumber + "\n" +
                "First Name: " + firstName + "\n" +
                "Middle Initial: " + middleInitial + "\n" +
                "Last Name: " + lastName + "\n" +
                "Program: " + course + "\n" +
                "Year Level: " + yearLevel + "\n";
    }

}
