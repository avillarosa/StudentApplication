package com.example.studentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.studentapplication.model.CourseEnrollment;
import com.example.studentapplication.model.Student;
import com.example.studentapplication.model.StudentDB;

import java.util.ArrayList;

public class CreateStudentActivity extends AppCompatActivity {

    protected final String TAG = "Summary Screen";
    protected Menu detailMenu;
    protected Student s;
    protected ArrayList<Student> sList;
    protected EditText firstName;
    protected EditText lastName;
    protected EditText cwid;
    protected Button addCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_student);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_screen_menu3, menu);
        detailMenu = menu;
        menu.findItem(R.id.action_done2).setVisible(true);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_done2) {

            firstName = findViewById(R.id.first_name_val_id2);
            lastName = findViewById(R.id.last_name_val_id2);
            cwid = findViewById(R.id.cwid_val_id2);
            s = new Student(firstName.toString(), lastName.toString(), Integer.parseInt(cwid.toString()));
            sList.add(s);
            addCourse = findViewById(R.id.add_course);

            Intent intent = new Intent(this, SummaryLVActivity.class);
            this.startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
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
