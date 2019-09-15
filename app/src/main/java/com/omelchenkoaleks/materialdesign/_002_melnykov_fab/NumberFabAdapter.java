package com.omelchenkoaleks.materialdesign._002_melnykov_fab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.omelchenkoaleks.materialdesign.R;

import java.util.List;

public class NumberFabAdapter extends BaseAdapter {
    private List<Number> mNumbers;
    private LayoutInflater mLayoutInflater;

    public NumberFabAdapter(List<Number> numbers, LayoutInflater layoutInflater) {
        mNumbers = numbers;
        mLayoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return mNumbers.size();
    }

    @Override
    public Object getItem(int position) {
        return mNumbers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.item_melnykov_fab, parent, false);
        }

        Number number = (Number) getItem(position);

        TextView numberTextView = view.findViewById(R.id.melnykov_text_view);

        numberTextView.setText("Number: " + number.getNumber());

        return view;
    }
}
