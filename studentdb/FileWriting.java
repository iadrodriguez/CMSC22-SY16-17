import java.util.*;
import java.io.*;
import java.lang.*;

public class FileWriting {
    private String path = new String();
    private String studentNum = new String();
    private String firstname = new String();
    private char middleInitial;
    private String lastName = new String();
    private String course = new String();
    private int yearLevel;
    private Student newStudent = new Student(studentNum, firstname, middleInitial, lastName, course, yearLevel);


    public FileWriting(String path) {
        this.path = path;
    }

    public void register(String studentNum, String firstname, char middleInitial, String lastName, String course, int yearLevel){
        // private Student newStudent;
        // private Student temp = new Student(studentNum, firstname, middleInitial, lastName, course, yearLevel);
        
            List<Student> students = new ArrayList<Student>();
            FileReading fileRead = new FileReading(path);
            students = fileRead.getStudents();
            for (Student std : students) {                
                if (studentNum.equals(std.getStudentNumber())) {
                    System.err.println("\tStudent already exist!");
                    //throw new IllegalArgumentException("Student number already exist.");
                    // System.out.println("1exists already.");
                }
            }

            this.studentNum = studentNum;
            this.firstname = firstname;
            this.middleInitial = middleInitial;
            this.lastName = lastName;
            this.course = course;
            this.yearLevel = yearLevel;
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
        File file = new File(path);
        List<Student> students = new ArrayList<Student>();
        FileReading fileRead = new FileReading(path);
        students = fileRead.getStudents();
            Iterator<Student> it = students.iterator();
            while (it.hasNext()) {
              Student std = it.next();
              if (std.getStudentNumber().equals(studentNum)) {
                it.remove();
                //System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
              }
             //System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
            }
            try {
            BufferedWriter k = new BufferedWriter(new FileWriter(file));
            k.write("hooooooooooooooyyyyy ngaaaaanoooonngngggg ikaaaawwww angggggg maaaaaagggggdddeeeelllleeeeettteeee!!!");
            } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {

            File file = new File(path);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

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
            // bw.newLine();
            bw.write(studentNum);
            bw.newLine();
            bw.write(firstname);
            bw.newLine();
            bw.write(Character.toString(middleInitial));
            bw.newLine();
            bw.write(lastName);
            bw.newLine();
            bw.write(course);
            bw.newLine();
            bw.write(Integer.toString(yearLevel));
            bw.newLine();
            // better use finally here...
            bw.close();

            // System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}