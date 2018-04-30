package com.example.patrick.viewdemo.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.patrick.viewdemo.R;

public class MyView extends View{

    private Paint mPaint;

    // MyView could not work while Written as MyView(Context context).
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, getWidth(), getHeight(), mPaint);
        mPaint.setColor(Color.GREEN);
        mPaint.setTextSize(20);
        String text = getContext().getString(R.string.hello);
        canvas.drawText(text, getWidth() / 2, getHeight() /2, mPaint);
    }


}
