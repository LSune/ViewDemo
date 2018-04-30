package com.example.patrick.viewdemo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import com.example.patrick.viewdemo.Adapter.MyAdapter;
import com.example.patrick.viewdemo.Interface.OnDeleteListener;
import com.example.patrick.viewdemo.View.MyListView;
import com.example.patrick.viewdemo.View.MyView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mainLayout;

    private MyListView mMyListView;

    private MyAdapter mMyAdapter;

    private List<String> contentList = new ArrayList<String>();
    //this part is going to be read
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        init();
//        mainLayout = (LinearLayout) findViewById(R.id.main_layout);
//        LayoutInflater layoutInflater = LayoutInflater.from(this);
//        View buttonLayout = layoutInflater.inflate(R.layout.button_layout, null);
//        mainLayout.addView(buttonLayout);
//
//        SimpleLayout simpleLayout = (SimpleLayout) layoutInflater.inflate(R.layout.layout_my_view, null);
//        mainLayout.addView(simpleLayout);

//        View myView = layoutInflater.inflate(R.layout.layout_my_view_text, null);
//        mainLayout.addView(myView);

//        View counterView = layoutInflater.inflate(R.layout.layout_counter_view, null);
//        mainLayout.addView(counterView);

//        View title = layoutInflater.inflate(R.layout.title, null);
//        mainLayout.addView(title);
    }

    private void init() {
        initList();
        mMyListView = findViewById(R.id.my_list_view);
        mMyListView.setOnDeleteListener(new OnDeleteListener() {
            @Override
            public void onDelete(int index) {
                contentList.remove(index);
                mMyAdapter.notifyDataSetChanged();
            }
        });
        mMyAdapter = new MyAdapter(this, 0, contentList);
        mMyListView.setAdapter(mMyAdapter);
    }

    private void initList() {
        contentList.add("Content Item 1");
        contentList.add("Content Item 2");
        contentList.add("Content Item 3");
        contentList.add("Content Item 4");
        contentList.add("Content Item 5");
        contentList.add("Content Item 6");
        contentList.add("Content Item 7");
        contentList.add("Content Item 8");
        contentList.add("Content Item 9");
        contentList.add("Content Item 10");
        contentList.add("Content Item 11");
        contentList.add("Content Item 12");
        contentList.add("Content Item 13");
        contentList.add("Content Item 14");
        contentList.add("Content Item 15");
        contentList.add("Content Item 16");
        contentList.add("Content Item 17");
        contentList.add("Content Item 18");
        contentList.add("Content Item 19");
        contentList.add("Content Item 20");


    }
}
