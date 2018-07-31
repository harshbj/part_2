package com.example.admin.part_2;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.github.chrisbanes.photoview.PhotoView;

import net.skoumal.fragmentback.BackFragment;

public class tab4 extends android.support.v4.app.Fragment implements BackFragment {
    private CardView itru_sem3, itru_sem4, itru_sem5, itru_sem6, itru_sem7, itru_sem8;
    private PhotoView photoView;
    ScrollView scrollView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4_dept,container,false);

        itru_sem3 = (CardView) view.findViewById(R.id.instrusem3);
        itru_sem4 = (CardView) view.findViewById(R.id.instrusem4);
        itru_sem5 = (CardView) view.findViewById(R.id.instrusem5);
        itru_sem6 = (CardView) view.findViewById(R.id.instrusem6);
        itru_sem7 = (CardView) view.findViewById(R.id.instrusem7);
        itru_sem8 = (CardView) view.findViewById(R.id.instrusem8);
        photoView = view.findViewById(R.id.photo_instru);
        scrollView = view.findViewById(R.id.backgroundid_instru);


        itru_sem3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                itru_sem3.setVisibility(View.GONE);
                itru_sem4.setVisibility(View.GONE);
                itru_sem5.setVisibility(View.GONE);
                itru_sem6.setVisibility(View.GONE);
                itru_sem7.setVisibility(View.GONE);
                itru_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.vcet);



            }
        });
        itru_sem4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                itru_sem3.setVisibility(View.GONE);
                itru_sem4.setVisibility(View.GONE);
                itru_sem5.setVisibility(View.GONE);
                itru_sem6.setVisibility(View.GONE);
                itru_sem7.setVisibility(View.GONE);
                itru_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.civil);



            }
        });
        itru_sem5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                itru_sem3.setVisibility(View.GONE);
                itru_sem4.setVisibility(View.GONE);
                itru_sem5.setVisibility(View.GONE);
                itru_sem6.setVisibility(View.GONE);
                itru_sem7.setVisibility(View.GONE);
                itru_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.comp);



            }
        });
        itru_sem6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                itru_sem3.setVisibility(View.GONE);
                itru_sem4.setVisibility(View.GONE);
                itru_sem5.setVisibility(View.GONE);
                itru_sem6.setVisibility(View.GONE);
                itru_sem7.setVisibility(View.GONE);
                itru_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.instrudept);



            }
        });
        itru_sem7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                itru_sem3.setVisibility(View.GONE);
                itru_sem4.setVisibility(View.GONE);
                itru_sem5.setVisibility(View.GONE);
                itru_sem6.setVisibility(View.GONE);
                itru_sem7.setVisibility(View.GONE);
                itru_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.mechdept);



            }
        });
        itru_sem8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                itru_sem3.setVisibility(View.GONE);
                itru_sem4.setVisibility(View.GONE);
                itru_sem5.setVisibility(View.GONE);
                itru_sem6.setVisibility(View.GONE);
                itru_sem7.setVisibility(View.GONE);
                itru_sem8.setVisibility(View.GONE);
                scrollView.setBackgroundColor(Color.BLACK);
                Log.e("TAG", "black " );
                photoView.setImageResource(R.drawable.itdept);



            }
        });






        return view;
    }

    @Override
    public boolean onBackPressed() {

        if(itru_sem3.getVisibility() == View.GONE)
        {
            scrollView.setBackgroundColor(Color.WHITE);
            photoView.setVisibility(View.GONE);
            itru_sem3.setVisibility(View.VISIBLE);
            itru_sem4.setVisibility(View.VISIBLE);
            itru_sem5.setVisibility(View.VISIBLE);
            itru_sem6.setVisibility(View.VISIBLE);
            itru_sem7.setVisibility(View.VISIBLE);
            itru_sem8.setVisibility(View.VISIBLE);
        }
        return false;
    }

    @Override
    public int getBackPriority() {
        return NORMAL_BACK_PRIORITY;
    }
}
