package com.example.studentapplication.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.studentapplication.R;
import com.example.studentapplication.StudentDetailActivity;
import com.example.studentapplication.model.Student;
import com.example.studentapplication.model.StudentDB;

public class SummaryLVAdapter extends BaseAdapter {
    protected int count;

    @Override
    public int getCount() {
        return StudentDB.getInstance().getStudents().size();
    }

    @Override
    public Object getItem(int i) {
        return StudentDB.getInstance().getStudents().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row_view;

        if(view == null) {
            count++;
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.student_row, viewGroup, false);
        }
        else row_view = view;

        Student s = StudentDB.getInstance().getStudents().get(i);

        TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name);
        firstNameView.setText(s.getFirstName());
        TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name);
        lastNameView.setText(s.getLastName());
        TextView cwidView = (TextView) row_view.findViewById(R.id.cwid);
        cwidView.setText(String.valueOf(s.getCwid()));

        row_view.setTag(new Integer(i));

        row_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), StudentDetailActivity.class);
                intent.putExtra("StudentIndex", ((Integer)view.getTag()).intValue());
                view.getContext().startActivity(intent);
            }
        });

        return row_view;
    }
}
