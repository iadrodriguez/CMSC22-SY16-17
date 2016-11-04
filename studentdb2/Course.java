package studentdb2;

import java.io.Serializable;

/**
 * Created by USER on 11/4/2016.
 */


public class Course implements Serializable {
    private String courseCode;
    private String courseDescription;

    public Course() {

    }

    public Course(String courseCode, String courseDescription) {
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode(String courseCode) {
        return courseCode;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDescription(String courseDescription) {
        return courseDescription;
    }

    public String toString() {
        return "Course Code: " + courseCode + "\n" +
                "Course Description: " + courseDescription + "\n";
    }
}

