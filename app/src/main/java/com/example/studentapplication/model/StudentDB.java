package com.example.studentapplication.model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    protected ArrayList<Student> mStudents;

    static public StudentDB getInstance() {
        return ourInstance;
    }

    private StudentDB() {
        createStudentObjects();
    }

    public ArrayList<Student> getStudents() {
        return mStudents;
    }

    public void setStudents(ArrayList<Student> students) {
        mStudents = students;
    }

    protected void createStudentObjects() {
        // Creating Adam Student object
        Student s = new Student("Adam", "Villarosa", 803111);
        ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC256", "A"));
        courses.add(new CourseEnrollment("CPSC254", "A-"));
        s.setCourses(courses);
        mStudents = new ArrayList<Student>();
        mStudents.add(s);

        // Creating Alan Student object
        s = new Student("Alan", "Newsie", 209345);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        mStudents.add(s);

        // Creating Bob Student object
        s = new Student("Bob", "Williams", 493827);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        mStudents.add(s);

        // Creating Jim Student object
        s = new Student("Jim", "Halpert", 587858);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        mStudents.add(s);

        // Creating Dwight Student object
        s = new Student("Dwight", "Shrute", 198384);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        mStudents.add(s);

        // Creating Michael Student object
        s = new Student("Michael", "Scott", 958371);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        mStudents.add(s);

        // Creating Pam Student object
        s = new Student("Pam", "Beesly", 496011);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        mStudents.add(s);
        //
        //StudentDB.getInstance().setStudents(studentList);
    }
}
