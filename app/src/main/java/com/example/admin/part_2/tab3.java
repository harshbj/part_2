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

public class tab3 extends android.support.v4.app.Fragment implements BackFragment{

    private CardView extc_sem3, extc_sem4, extc_sem5, extc_sem6, extc_sem7, extc_sem8;
    private PhotoView photoView;
    ScrollView scrollView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_dept,container,false);

        extc_sem3 = (CardView) view.findViewById(R.id.extcsem3);
        extc_sem4 = (CardView) view.findViewById(R.id.extcsem4);
        extc_sem5 = (CardView) view.findViewById(R.id.extcsem5);
        extc_sem6 = (CardView) view.findViewById(R.id.extcsem6);
        extc_sem7 = (CardView) view.findViewById(R.id.extcsem7);
        extc_sem8 = (CardView) view.findViewById(R.id.extcsem8);
        photoView = view.findViewById(R.id.photo_extc);
        scrollView = view.findViewById(R.id.backgroundid_extc);

        extc_sem3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                extc_sem3.setVisibility(View.GONE);
                extc_sem4.setVisibility(View.GONE);
                extc_sem5.setVisibility(View.GONE);
                extc_sem6.setVisibility(View.GONE);
                extc_sem7.setVisibility(View.GONE);
                extc_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.vcet);



            }
        });

        extc_sem4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                extc_sem3.setVisibility(View.GONE);
                extc_sem4.setVisibility(View.GONE);
                extc_sem5.setVisibility(View.GONE);
                extc_sem6.setVisibility(View.GONE);
                extc_sem7.setVisibility(View.GONE);
                extc_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.civil);



            }
        });

        extc_sem5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                extc_sem3.setVisibility(View.GONE);
                extc_sem4.setVisibility(View.GONE);
                extc_sem5.setVisibility(View.GONE);
                extc_sem6.setVisibility(View.GONE);
                extc_sem7.setVisibility(View.GONE);
                extc_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });
        extc_sem6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                extc_sem3.setVisibility(View.GONE);
                extc_sem4.setVisibility(View.GONE);
                extc_sem5.setVisibility(View.GONE);
                extc_sem6.setVisibility(View.GONE);
                extc_sem7.setVisibility(View.GONE);
                extc_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.comp);



            }
        });
        extc_sem7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                extc_sem3.setVisibility(View.GONE);
                extc_sem4.setVisibility(View.GONE);
                extc_sem5.setVisibility(View.GONE);
                extc_sem6.setVisibility(View.GONE);
                extc_sem7.setVisibility(View.GONE);
                extc_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.mechdept);



            }
        });
        extc_sem8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                extc_sem3.setVisibility(View.GONE);
                extc_sem4.setVisibility(View.GONE);
                extc_sem5.setVisibility(View.GONE);
                extc_sem6.setVisibility(View.GONE);
                extc_sem7.setVisibility(View.GONE);
                extc_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });
                return view;


}

    @Override
    public boolean onBackPressed() {

        if(extc_sem3.getVisibility() == View.GONE)
        {
            scrollView.setBackgroundColor(Color.WHITE);
            photoView.setVisibility(View.GONE);
            extc_sem3.setVisibility(View.VISIBLE);
            extc_sem4.setVisibility(View.VISIBLE);
            extc_sem5.setVisibility(View.VISIBLE);
            extc_sem6.setVisibility(View.VISIBLE);
            extc_sem7.setVisibility(View.VISIBLE);
            extc_sem8.setVisibility(View.VISIBLE);
        }
        return false;
    }

    @Override
    public int getBackPriority() {
        return NORMAL_BACK_PRIORITY;
    }
}

