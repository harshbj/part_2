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

public class tab6 extends android.support.v4.app.Fragment implements BackFragment{
    private CardView mech_sem3, mech_sem4, mech_sem5, mech_sem6, mech_sem7, mech_sem8;
    private PhotoView photoView;
    ScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab6_dept,container,false);

        mech_sem3 = (CardView) view.findViewById(R.id.mechsem3);
        mech_sem4 = (CardView) view.findViewById(R.id.mechsem4);
        mech_sem5 = (CardView) view.findViewById(R.id.mechsem5);
        mech_sem6 = (CardView) view.findViewById(R.id.mechsem6);
        mech_sem7 = (CardView) view.findViewById(R.id.mechsem7);
        mech_sem8 = (CardView) view.findViewById(R.id.mechsem8);
        photoView = view.findViewById(R.id.photo_mech);
        scrollView = view.findViewById(R.id.backgroundid_mech);

        mech_sem3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                mech_sem3.setVisibility(View.GONE);
                mech_sem4.setVisibility(View.GONE);
                mech_sem5.setVisibility(View.GONE);
                mech_sem6.setVisibility(View.GONE);
                mech_sem7.setVisibility(View.GONE);
                mech_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.vcet);



            }
        });

        mech_sem4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                mech_sem3.setVisibility(View.GONE);
                mech_sem4.setVisibility(View.GONE);
                mech_sem5.setVisibility(View.GONE);
                mech_sem6.setVisibility(View.GONE);
                mech_sem7.setVisibility(View.GONE);
                mech_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.comp);



            }
        });
        mech_sem5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                mech_sem3.setVisibility(View.GONE);
                mech_sem4.setVisibility(View.GONE);
                mech_sem5.setVisibility(View.GONE);
                mech_sem6.setVisibility(View.GONE);
                mech_sem7.setVisibility(View.GONE);
                mech_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.elecdept);



            }
        });
        mech_sem6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                mech_sem3.setVisibility(View.GONE);
                mech_sem4.setVisibility(View.GONE);
                mech_sem5.setVisibility(View.GONE);
                mech_sem6.setVisibility(View.GONE);
                mech_sem7.setVisibility(View.GONE);
                mech_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });
        mech_sem7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                mech_sem3.setVisibility(View.GONE);
                mech_sem4.setVisibility(View.GONE);
                mech_sem5.setVisibility(View.GONE);
                mech_sem6.setVisibility(View.GONE);
                mech_sem7.setVisibility(View.GONE);
                mech_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.civil);



            }
        });
        mech_sem8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                mech_sem3.setVisibility(View.GONE);
                mech_sem4.setVisibility(View.GONE);
                mech_sem5.setVisibility(View.GONE);
                mech_sem6.setVisibility(View.GONE);
                mech_sem7.setVisibility(View.GONE);
                mech_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.mechdept);



            }
        });
        return view;
    }

    @Override
    public boolean onBackPressed() {

        if(mech_sem3.getVisibility() == View.GONE)
        {
            scrollView.setBackgroundColor(Color.WHITE);
            photoView.setVisibility(View.GONE);
            mech_sem3.setVisibility(View.VISIBLE);
            mech_sem4.setVisibility(View.VISIBLE);
            mech_sem5.setVisibility(View.VISIBLE);
            mech_sem6.setVisibility(View.VISIBLE);
            mech_sem7.setVisibility(View.VISIBLE);
            mech_sem8.setVisibility(View.VISIBLE);
        }
        return false;
    }

    @Override
    public int getBackPriority() {
        return NORMAL_BACK_PRIORITY;
    }
}
