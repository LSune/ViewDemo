package com.example.patrick.viewdemo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.patrick.viewdemo.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.my_list_view_item, null);
        } else {
            view = convertView;
        }
        TextView textView = view.findViewById(R.id.text_view);
        textView.setText((CharSequence) getItem(position));
        return view;
    }
}
