package com.example.admin.part_2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.github.chrisbanes.photoview.PhotoView;

import net.skoumal.fragmentback.BackFragment;

import static com.example.admin.part_2.R.drawable.logo;

public class tab1 extends android.support.v4.app.Fragment implements BackFragment {

    private CardView it_sem3, it_sem4, it_sem5, it_sem6, it_sem7, it_sem8;
    private PhotoView photoView;
    ScrollView scrollView;





    @SuppressLint("ResourceAsColor")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_dept, container, false);
        it_sem3 = (CardView) view.findViewById(R.id.itsem3);
        it_sem4 = (CardView) view.findViewById(R.id.itsem4);
        it_sem5 = (CardView) view.findViewById(R.id.itsem5);
        it_sem6 = (CardView) view.findViewById(R.id.itsem6);
        it_sem7 = (CardView) view.findViewById(R.id.itsem7);
        it_sem8 = (CardView) view.findViewById(R.id.itsem8);
        photoView = view.findViewById(R.id.photo_it);
        scrollView = view.findViewById(R.id.backgroundid_it);


        it_sem3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                it_sem3.setVisibility(View.GONE);
                it_sem4.setVisibility(View.GONE);
                it_sem5.setVisibility(View.GONE);
                it_sem6.setVisibility(View.GONE);
                it_sem7.setVisibility(View.GONE);
                it_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.vcet);



            }
        });
        it_sem4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                it_sem3.setVisibility(View.GONE);
                it_sem4.setVisibility(View.GONE);
                it_sem5.setVisibility(View.GONE);
                it_sem6.setVisibility(View.GONE);
                it_sem7.setVisibility(View.GONE);
                it_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.logo);



            }
        });
        it_sem5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                it_sem3.setVisibility(View.GONE);
                it_sem4.setVisibility(View.GONE);
                it_sem5.setVisibility(View.GONE);
                it_sem6.setVisibility(View.GONE);
                it_sem7.setVisibility(View.GONE);
                it_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.civil);



            }
        });
        it_sem6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                it_sem3.setVisibility(View.GONE);
                it_sem4.setVisibility(View.GONE);
                it_sem5.setVisibility(View.GONE);
                it_sem6.setVisibility(View.GONE);
                it_sem7.setVisibility(View.GONE);
                it_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.comp);



            }
        });
        it_sem7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                it_sem3.setVisibility(View.GONE);
                it_sem4.setVisibility(View.GONE);
                it_sem5.setVisibility(View.GONE);
                it_sem6.setVisibility(View.GONE);
                it_sem7.setVisibility(View.GONE);
                it_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });
        it_sem8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                it_sem3.setVisibility(View.GONE);
                it_sem4.setVisibility(View.GONE);
                it_sem5.setVisibility(View.GONE);
                it_sem6.setVisibility(View.GONE);
                it_sem7.setVisibility(View.GONE);
                it_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.itdept);



            }
        });

        return view;

    }

    @Override
    public boolean onBackPressed() {
        if(it_sem3.getVisibility() == View.GONE)
        {
            scrollView.setBackgroundColor(Color.WHITE);
            photoView.setVisibility(View.GONE);
            it_sem3.setVisibility(View.VISIBLE);
            it_sem4.setVisibility(View.VISIBLE);
            it_sem5.setVisibility(View.VISIBLE);
            it_sem6.setVisibility(View.VISIBLE);
            it_sem7.setVisibility(View.VISIBLE);
            it_sem8.setVisibility(View.VISIBLE);
            return true;
        }
        else {
            return false;
        }

        }


    @Override
    public int getBackPriority() {
        return NORMAL_BACK_PRIORITY;
    }
}
