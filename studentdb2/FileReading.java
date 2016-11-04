package studentdb2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

/**
 * Created by USER on 11/4/2016.
 */
import java.lang.Integer;

public class FileReading {

    private String path;

    public FileReading(String path) {
        this.path = path;
    }

    public ArrayList<Student> list = new ArrayList<Student>();

    BufferedReader br = null;

    public List<Student> getStudents() {
        File fin = new File(path);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Student> list = new ArrayList<Student>();
        try {


            if(fin.length() == 0) {
                // file is emtpy!!
                System.err.println("FILE IS EMPTY");
//                System.exit(-1);
            } else {
                fis = new FileInputStream(fin);
                ois = new ObjectInputStream(fis);

                list = (List<Student>) ois.readObject();
                return list;
            }




            // print them out. note: toString() methods have been defined
            if (ois != null) {
                ois.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException ce) {
            // this might be thrown by ois.readObject()
            ce.printStackTrace();
        }
        finally {

            // make sure to close the files!
            try {
//                fos.close();
                if (fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return list;
    }

    private ArrayList<Student> getter() {
        return list;
    }

    public Student getStudent(String studentNum) {
        List<Student> listStd = getStudents();

        if (listStd != null) {
            for (Student std : listStd) {
                if (studentNum.equals(std.getStudentNumber())) {
                    return std;
                }
            }
            throw new IllegalArgumentException("Student number not found.");
        }
        Course def = new Course("NoCrseCode", "NoCrseDescption");
        Student std2 = new Student("0000","NoFName", ' ', "NoLastname", "None", 0, "noCrush", def);
        return std2;
    }
}
