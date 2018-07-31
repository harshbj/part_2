package com.example.admin.part_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class part_2 extends AppCompatActivity {

    public CardView cfaculty,ctimetable,ccontus,ccalendar,cnotice,cimp,clocation,ccomittee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("VCET");

        cfaculty = (CardView) findViewById(R.id.cardfac);
        ctimetable = (CardView) findViewById(R.id.cardtt);
        ccontus = (CardView) findViewById(R.id.cardcont);
        ccalendar = (CardView) findViewById(R.id.cardcal);
        cimp = (CardView) findViewById(R.id.cardimp);
        clocation = (CardView) findViewById(R.id.cardloc);
        ccomittee = (CardView) findViewById(R.id.cardcomm);
        cnotice = (CardView) findViewById(R.id.cardnotice);


        cfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(part_2.this,Faculty.class);
                startActivity(i);
            }
        });
        ctimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(part_2.this,Deptlist.class);
                startActivity(i);
            }
        });
        ccalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(part_2.this,Calender.class);
                startActivity(i);
            }
        });
        ccontus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(part_2.this,Contactus.class);
                startActivity(i);
            }
        });
        cimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                }
        });
        ccomittee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(part_2.this,Faculty.class);
                startActivity(i);
            }
        });
        clocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(part_2.this,Location.class);
                startActivity(i);
            }
        });
        cnotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(part_2.this,Notice.class);
                startActivity(i);
            }
        });

    }
}
