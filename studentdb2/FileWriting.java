package studentdb2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io. *;

/**
 * Created by USER on 11/4/2016.
 */
public class FileWriting {
    private String path = new String();
    private File file = null;
    private String studentNum = new String();
    private String firstname = new String();
    private char middleInitial;
    private String lastName = new String();
    private String course = new String();
    private int yearLevel;
    private String crushName = new String();
    private String courseCode = new String();
    private String courseDescription = new String();
    private Course faveSubj = new Course(courseCode, courseDescription);
    List<Student> students = new ArrayList<Student>();





    public FileWriting(String path) {
        this.path = path;
    }

    public void register(String studentNum, String firstname, char middleInitial, String lastName, String course, int yearLevel, String crushName, Course faveSubj){
        // private Student newStudent;
        // private Student temp = new Student(studentNum, firstname, middleInitial, lastName, course, yearLevel);

        FileReading fileRead = new FileReading(path);
        students = fileRead.getStudents();
        if (students != null) {
            for (Student std : students) {
                if (studentNum.equals(std.getStudentNumber())) {
                    throw new IllegalArgumentException("Student number already exist.");
                    // System.out.println("1exists already.");
                }
            }
        }


        this.studentNum = studentNum;
        this.firstname = firstname;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.crushName = crushName;
        this.faveSubj = faveSubj;
        Student std = new Student(studentNum, firstname, middleInitial, lastName, course, yearLevel, crushName, faveSubj);
//        students.add(std);
        System.out.println("Student added!");
        // BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

        // bw.write(studentNum);
        // bw.newLine();
        // bw.write(firstname);
        // bw.newLine();
        // bw.write(Character.toString(middleInitial));
        // bw.newLine();
        // bw.write(lastName);
        // bw.newLine();
        // bw.write(course);
        // bw.newLine();
        // bw.write(Integer.toString(yearLevel));
        // bw.newLine();
        // // better use finally here...
        // bw.close();

        // System.out.println("Done");
    }

    public void delete(String studentNum) {
        List<Student> students = new ArrayList<Student>();
        FileReading fileRead = new FileReading(path);
        students = fileRead.getStudents();
        for (Student std : students) {
            Student bef = std;
            if (studentNum.equals(std.getStudentNumber())) {
                throw new IllegalArgumentException("Student number already exist.");
                // System.out.println("1exists already.");
            }
        }
    }

    public void save(List<Student> students) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

//            File file = new File(path);
//            // if file doesnt exists, then create it
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

            File fout = new File(path);
            fos = new FileOutputStream(fout);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(students);
//            oos.writeObject(g2);
//            oos.writeObject(g3);

            oos.close();

            // bw.write(newStudent.toString());

            // bw.write(newStudent.getStudentNumber());
            // bw.newLine();
            // bw.write(newStudent.getFirstName());
            // bw.newLine();
            // bw.write(Character.toString(newStudent.getMiddleInitial()));
            // bw.newLine();
            // bw.write(newStudent.getLastName());
            // bw.newLine();
            // bw.write(newStudent.getCourse());
            // bw.newLine();
            // bw.write(Integer.toString(newStudent.getYearLevel()));
//            // bw.newLine();
//            bw.write(studentNum);
//            bw.newLine();
//            bw.write(firstname);
//            bw.newLine();
//            bw.write(Character.toString(middleInitial));
//            bw.newLine();
//            bw.write(lastName);
//            bw.newLine();
//            bw.write(course);
//            bw.newLine();
//            bw.write(Integer.toString(yearLevel));
//            bw.newLine();
////            bw.
//                    // better use finally here...
//                            bw.close();

            // System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
