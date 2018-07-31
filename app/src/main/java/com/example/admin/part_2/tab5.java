package com.example.admin.part_2;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.github.chrisbanes.photoview.PhotoView;

import net.skoumal.fragmentback.BackFragment;

public class tab5 extends android.support.v4.app.Fragment implements BackFragment {
    private CardView civil_sem3, civil_sem4, civil_sem5, civil_sem6, civil_sem7, civil_sem8;
    private PhotoView photoView;
    ScrollView scrollView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab5_dept,container,false);

        civil_sem3 = (CardView) view.findViewById(R.id.civilsem3);
        civil_sem4 = (CardView) view.findViewById(R.id.civilsem4);
        civil_sem5 = (CardView) view.findViewById(R.id.civilsem5);
        civil_sem6 = (CardView) view.findViewById(R.id.civilsem6);
        civil_sem7 = (CardView) view.findViewById(R.id.civilsem7);
        civil_sem8 = (CardView) view.findViewById(R.id.civilsem8);
        photoView = view.findViewById(R.id.photo_civil);
        scrollView = view.findViewById(R.id.backgroundid_civil);

        civil_sem3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                civil_sem3.setVisibility(View.GONE);
                civil_sem4.setVisibility(View.GONE);
                civil_sem5.setVisibility(View.GONE);
                civil_sem6.setVisibility(View.GONE);
                civil_sem7.setVisibility(View.GONE);
                civil_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.vcet);



            }
        });


        civil_sem4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                civil_sem3.setVisibility(View.GONE);
                civil_sem4.setVisibility(View.GONE);
                civil_sem5.setVisibility(View.GONE);
                civil_sem6.setVisibility(View.GONE);
                civil_sem7.setVisibility(View.GONE);
                civil_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });


        civil_sem5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                civil_sem3.setVisibility(View.GONE);
                civil_sem4.setVisibility(View.GONE);
                civil_sem5.setVisibility(View.GONE);
                civil_sem6.setVisibility(View.GONE);
                civil_sem7.setVisibility(View.GONE);
                civil_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.itdept);



            }
        });

        civil_sem6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                civil_sem3.setVisibility(View.GONE);
                civil_sem4.setVisibility(View.GONE);
                civil_sem5.setVisibility(View.GONE);
                civil_sem6.setVisibility(View.GONE);
                civil_sem7.setVisibility(View.GONE);
                civil_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.comp);



            }
        });

        civil_sem7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                civil_sem3.setVisibility(View.GONE);
                civil_sem4.setVisibility(View.GONE);
                civil_sem5.setVisibility(View.GONE);
                civil_sem6.setVisibility(View.GONE);
                civil_sem7.setVisibility(View.GONE);
                civil_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.mechdept);



            }
        });

        civil_sem8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                civil_sem3.setVisibility(View.GONE);
                civil_sem4.setVisibility(View.GONE);
                civil_sem5.setVisibility(View.GONE);
                civil_sem6.setVisibility(View.GONE);
                civil_sem7.setVisibility(View.GONE);
                civil_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.civil);



            }
        });







        return view;
    }

    @Override
    public boolean onBackPressed() {

        if(civil_sem3.getVisibility() == View.GONE)
        {
            scrollView.setBackgroundColor(Color.WHITE);
            photoView.setVisibility(View.GONE);
            civil_sem3.setVisibility(View.VISIBLE);
            civil_sem4.setVisibility(View.VISIBLE);
            civil_sem5.setVisibility(View.VISIBLE);
            civil_sem6.setVisibility(View.VISIBLE);
            civil_sem7.setVisibility(View.VISIBLE);
            civil_sem8.setVisibility(View.VISIBLE);
        }
        return false;
    }

    @Override
    public int getBackPriority() {
        return NORMAL_BACK_PRIORITY;
    }
}
