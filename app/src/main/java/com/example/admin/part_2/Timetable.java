package com.example.admin.part_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Timetable extends AppCompatActivity {

    public Button sem_1,sem_2,sem_3,sem_4,sem_5,sem_6,sem_7,sem_8;

    String passkey = "semtracker";

    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        setTitle("Time Table");

        sem_3 = (Button) findViewById(R.id.sem3);
        sem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Timetable.this,Deptlist.class);
                bundle.putString(passkey,"3");
                tab1 tb1 = new tab1();
                tb1.setArguments(bundle);
                startActivity(i);
            }
        });



        sem_4 = (Button) findViewById(R.id.sem4);
        sem_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Timetable.this,Deptlist.class);
                i.putExtra(passkey,4);
                startActivity(i);
            }
        });

        sem_5 = (Button) findViewById(R.id.sem5);
        sem_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Timetable.this,Deptlist.class);
                i.putExtra(passkey,5);
                startActivity(i);
            }
        });

        sem_6 = (Button) findViewById(R.id.sem6);
        sem_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Timetable.this,Deptlist.class);
                i.putExtra("semtracker",6);
                startActivity(i);
            }
        });

        sem_7 = (Button) findViewById(R.id.sem7);
        sem_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Timetable.this,Deptlist.class);
                i.putExtra("semtracker",7);
                startActivity(i);
            }
        });


        sem_8 = (Button) findViewById(R.id.sem8);
        sem_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Timetable.this,Deptlist.class);
                i.putExtra("semtracker",8);
                startActivity(i);
            }
        });




        }
}
