package com.example.studentapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.studentapplication.adapter.SummaryLVAdapter;
import com.example.studentapplication.model.CourseEnrollment;
import com.example.studentapplication.model.Student;
import com.example.studentapplication.model.StudentDB;

import java.util.ArrayList;

public class SummaryLVActivity extends Activity {

    protected final String TAG = "Summary Screen";
    protected ListView mSummaryView;
    SummaryLVAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.summary_listview);

        createStudentObjects();
        mSummaryView = findViewById(R.id.summary_list_view_id);
        ad = new SummaryLVAdapter();
        mSummaryView.setAdapter(ad);

    }



    protected void createStudentObjects() {
        // Creating Adam Student object
        Student s = new Student("Adam", "Villarosa", 803111);
        ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC256", "A"));
        courses.add(new CourseEnrollment("CPSC254", "A-"));
        s.setCourses(courses);
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s);

        // Creating Alan Student object
        s = new Student("Alan", "Newsie", 209345);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        studentList.add(s);

        // Creating Bob Student object
        s = new Student("Bob", "Williams", 493827);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        studentList.add(s);

        // Creating Jim Student object
        s = new Student("Jim", "Halpert", 587858);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        studentList.add(s);

        // Creating Dwight Student object
        s = new Student("Dwight", "Shrute", 198384);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        studentList.add(s);

        // Creating Michael Student object
        s = new Student("Michael", "Scott", 958371);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        studentList.add(s);

        // Creating Pam Student object
        s = new Student("Pam", "Beesly", 496011);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC411", "C+"));
        s.setCourses(courses);
        studentList.add(s);

        //
        StudentDB.getInstance().setStudents(studentList);
    }


    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        ad.notifyDataSetChanged();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }

}
