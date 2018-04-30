package com.example.patrick.viewdemo.View;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.patrick.viewdemo.R;

public class TitleView extends FrameLayout {

    private Button leftButton;

    private TextView titleText;

    public TitleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        titleText = findViewById(R.id.title_text);
        leftButton = findViewById(R.id.button_left);
        leftButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
    }

    public void setTitleText(String text){
        titleText.setText(text);
    }

    public void setLeftButtonText(String text){
        leftButton.setText(text);
    }

    public void setLeftButtonListener(OnClickListener l){
        leftButton.setOnClickListener(l);
    }

}
