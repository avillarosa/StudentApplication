package com.example.studentapplication.model;

import android.widget.TextView;

import java.util.ArrayList;

public class Student {
    protected String mFirstName;
    protected String mLastName;
    protected int mCwid;
    protected ArrayList<CourseEnrollment> mCourses;

    public Student(String firstName, String lastName, int cwid) {
        mFirstName = firstName;
        mLastName = lastName;
        mCwid = cwid;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public int getCwid() {
        return mCwid;
    }

    public void setCwid(int cwid) {
        mCwid = cwid;
    }

    public ArrayList<CourseEnrollment> getCourses() {
        return mCourses;
    }

    public void setCourses(ArrayList<CourseEnrollment> courses) {
        mCourses = courses;
    }
}
