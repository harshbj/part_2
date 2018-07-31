package com.example.admin.part_2;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.text.method.BaseKeyListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.github.chrisbanes.photoview.PhotoView;

import net.skoumal.fragmentback.BackFragment;


public class tab7 extends android.support.v4.app.Fragment implements BackFragment{

    private CardView fe_sem3, fe_sem4, fe_sem5, fe_sem6, fe_sem7, fe_sem8;
    private PhotoView photoView;
    ScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab7_dept,container,false);

        fe_sem3 = (CardView) view.findViewById(R.id.fesem3);
        fe_sem4 = (CardView) view.findViewById(R.id.fesem4);
        fe_sem5 = (CardView) view.findViewById(R.id.fesem5);
        fe_sem6 = (CardView) view.findViewById(R.id.fesem6);
        fe_sem7 = (CardView) view.findViewById(R.id.fesem7);
        fe_sem8 = (CardView) view.findViewById(R.id.fesem8);
        photoView = view.findViewById(R.id.photo_fe);
        scrollView = view.findViewById(R.id.backgroundid_fe);

        fe_sem3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                fe_sem3.setVisibility(View.GONE);
                fe_sem4.setVisibility(View.GONE);
                fe_sem5.setVisibility(View.GONE);
                fe_sem6.setVisibility(View.GONE);
                fe_sem7.setVisibility(View.GONE);
                fe_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.vcet);



            }
        });

        fe_sem4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                fe_sem3.setVisibility(View.GONE);
                fe_sem4.setVisibility(View.GONE);
                fe_sem5.setVisibility(View.GONE);
                fe_sem6.setVisibility(View.GONE);
                fe_sem7.setVisibility(View.GONE);
                fe_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.civil);



            }
        });
        fe_sem5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                fe_sem3.setVisibility(View.GONE);
                fe_sem4.setVisibility(View.GONE);
                fe_sem5.setVisibility(View.GONE);
                fe_sem6.setVisibility(View.GONE);
                fe_sem7.setVisibility(View.GONE);
                fe_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.elecdept);



            }
        });
        fe_sem6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                fe_sem3.setVisibility(View.GONE);
                fe_sem4.setVisibility(View.GONE);
                fe_sem5.setVisibility(View.GONE);
                fe_sem6.setVisibility(View.GONE);
                fe_sem7.setVisibility(View.GONE);
                fe_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });
        fe_sem7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                fe_sem3.setVisibility(View.GONE);
                fe_sem4.setVisibility(View.GONE);
                fe_sem5.setVisibility(View.GONE);
                fe_sem6.setVisibility(View.GONE);
                fe_sem7.setVisibility(View.GONE);
                fe_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.itdept);



            }
        });
        fe_sem8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                fe_sem3.setVisibility(View.GONE);
                fe_sem4.setVisibility(View.GONE);
                fe_sem5.setVisibility(View.GONE);
                fe_sem6.setVisibility(View.GONE);
                fe_sem7.setVisibility(View.GONE);
                fe_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.mechdept);



            }
        });
        return view;
    }

    @Override
    public boolean onBackPressed() {

        if(fe_sem3.getVisibility() == View.GONE)
        {
            scrollView.setBackgroundColor(Color.WHITE);
            photoView.setVisibility(View.GONE);
            fe_sem3.setVisibility(View.VISIBLE);
            fe_sem4.setVisibility(View.VISIBLE);
            fe_sem5.setVisibility(View.VISIBLE);
            fe_sem6.setVisibility(View.VISIBLE);
            fe_sem7.setVisibility(View.VISIBLE);
            fe_sem8.setVisibility(View.VISIBLE);
        }
        return false;
    }

    @Override
    public int getBackPriority() {
        return 0;
    }
}
