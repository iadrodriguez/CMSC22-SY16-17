import java.util.*;
import java.io.*;
import java.lang.*;

public class FileReading {

    private String path;

    public FileReading(String path) {
        this.path = path;
    }
    
    public ArrayList<Student> list = new ArrayList<Student>();

    BufferedReader br = null;

    public List<Student> getStudents() {

        try {

            String a;

            br = new BufferedReader(new FileReader(path));

            while ((a = br.readLine()) != null) {
                String b = br.readLine();
                String temp = br.readLine();
                char c;
                if (temp.equals("")) {
                    c = 32;
                } else {
                    c = temp.charAt(0);
                }
                String d = br.readLine();
                String e = br.readLine();
                int f = Integer.parseInt(br.readLine());
                Student student = new Student(a, b, c, d, e, f);
                list.add(student);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return getter();
    }

    private ArrayList<Student> getter() {
        return list;
    }

    public Student getStudent(String studentNum) {
        List<Student> listStd = getStudents();

        for (Student std : listStd) {
            if (studentNum.equals(std.getStudentNumber())) {
                return std;
            }
        }
        throw new IllegalArgumentException("Student number not found.");
    }
}