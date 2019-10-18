package com.example.studentapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.studentapplication.model.CourseEnrollment;
import com.example.studentapplication.model.Student;
import com.example.studentapplication.model.StudentDB;

public class StudentDetailActivity extends AppCompatActivity {

    protected Menu detailMenu;
    protected int studentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

       studentIndex = getIntent().getIntExtra("StudentIndex", 0);

        // 1. Populate the First Name, Last Name, and CWID
        Student sObj = StudentDB.getInstance().getStudents().get(studentIndex);
        EditText fNameView = (EditText) findViewById(R.id.first_name_val_id);
        EditText lNameView = (EditText) findViewById(R.id.last_name_val_id);
        EditText cNameView = (EditText) findViewById(R.id.cwid_val_id);
        fNameView.setText(sObj.getFirstName());
        lNameView.setText(sObj.getLastName());
        cNameView.setText(String.valueOf(sObj.getCwid()));

        // 2. Populate the CourseEnrollment List
     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_screen_menu, menu);
        detailMenu = menu;
        menu.findItem(R.id.action_edit).setVisible(true);
        menu.findItem(R.id.action_done).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_edit) {
            EditText fNameView = (EditText) findViewById(R.id.first_name_val_id);
            EditText lNameView = (EditText) findViewById(R.id.last_name_val_id);
            fNameView.setEnabled(true);
            lNameView.setEnabled(true);
            detailMenu.findItem(R.id.action_edit).setVisible(false);
            detailMenu.findItem(R.id.action_done).setVisible(true);
        } else if (item.getItemId() == R.id.action_done) {
            EditText fNameView = (EditText) findViewById(R.id.first_name_val_id);
            EditText lNameView = (EditText) findViewById(R.id.last_name_val_id);
            StudentDB.getInstance().getStudents().get(studentIndex).setFirstName(fNameView.getText().toString());
            StudentDB.getInstance().getStudents().get(studentIndex).setLastName(lNameView.getText().toString());
            fNameView.setEnabled(false);
            lNameView.setEnabled(false);
            detailMenu.findItem(R.id.action_edit).setVisible(true);
            detailMenu.findItem(R.id.action_done).setVisible(false);
        }
        return super.onOptionsItemSelected(item);
    }
}
