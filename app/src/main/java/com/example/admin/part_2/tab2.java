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

public class tab2 extends android.support.v4.app.Fragment implements BackFragment{

    private CardView comp_sem3, comp_sem4, comp_sem5, comp_sem6, comp_sem7, comp_sem8;
    private PhotoView photoView;
    ScrollView scrollView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_dept,container,false);

        comp_sem3 = (CardView) view.findViewById(R.id.compsem3);
        comp_sem4 = (CardView) view.findViewById(R.id.compsem4);
        comp_sem5 = (CardView) view.findViewById(R.id.compsem5);
        comp_sem6 = (CardView) view.findViewById(R.id.compsem6);
        comp_sem7 = (CardView) view.findViewById(R.id.compsem7);
        comp_sem8 = (CardView) view.findViewById(R.id.compsem8);
        photoView = view.findViewById(R.id.photo_comp);
        scrollView = view.findViewById(R.id.backgroundid_comp);

        comp_sem3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                comp_sem3.setVisibility(View.GONE);
                comp_sem4.setVisibility(View.GONE);
                comp_sem5.setVisibility(View.GONE);
                comp_sem6.setVisibility(View.GONE);
                comp_sem7.setVisibility(View.GONE);
                comp_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.vcet);



            }
        });

        comp_sem4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                comp_sem3.setVisibility(View.GONE);
                comp_sem4.setVisibility(View.GONE);
                comp_sem5.setVisibility(View.GONE);
                comp_sem6.setVisibility(View.GONE);
                comp_sem7.setVisibility(View.GONE);
                comp_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.civil);



            }
        });
        comp_sem5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                comp_sem3.setVisibility(View.GONE);
                comp_sem4.setVisibility(View.GONE);
                comp_sem5.setVisibility(View.GONE);
                comp_sem6.setVisibility(View.GONE);
                comp_sem7.setVisibility(View.GONE);
                comp_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.comp);



            }
        });
        comp_sem6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                comp_sem3.setVisibility(View.GONE);
                comp_sem4.setVisibility(View.GONE);
                comp_sem5.setVisibility(View.GONE);
                comp_sem6.setVisibility(View.GONE);
                comp_sem7.setVisibility(View.GONE);
                comp_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });
        comp_sem7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                comp_sem3.setVisibility(View.GONE);
                comp_sem4.setVisibility(View.GONE);
                comp_sem5.setVisibility(View.GONE);
                comp_sem6.setVisibility(View.GONE);
                comp_sem7.setVisibility(View.GONE);
                comp_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.itdept);



            }
        });

        comp_sem8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                comp_sem3.setVisibility(View.GONE);
                comp_sem4.setVisibility(View.GONE);
                comp_sem5.setVisibility(View.GONE);
                comp_sem6.setVisibility(View.GONE);
                comp_sem7.setVisibility(View.GONE);
                comp_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.mechdept);



            }
        });














        return view;
    }

    @Override
    public boolean onBackPressed() {
        if(comp_sem3.getVisibility() == View.GONE)
        {
            scrollView.setBackgroundColor(Color.WHITE);
            photoView.setVisibility(View.GONE);
            comp_sem3.setVisibility(View.VISIBLE);
            comp_sem4.setVisibility(View.VISIBLE);
            comp_sem5.setVisibility(View.VISIBLE);
            comp_sem6.setVisibility(View.VISIBLE);
            comp_sem7.setVisibility(View.VISIBLE);
            comp_sem8.setVisibility(View.VISIBLE);
        }
        return false;
    }

    @Override
    public int getBackPriority() {
        return NORMAL_BACK_PRIORITY;
    }
}
