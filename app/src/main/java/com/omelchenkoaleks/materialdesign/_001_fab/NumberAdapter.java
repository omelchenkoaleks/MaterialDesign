package com.omelchenkoaleks.materialdesign._001_fab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.omelchenkoaleks.materialdesign.R;

import java.util.List;

public class NumberAdapter extends BaseAdapter {
    private List<Number> mNumbers;
    private LayoutInflater mLayoutInflater;

    public NumberAdapter(List<Number> numbers, LayoutInflater layoutInflater) {
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
            view = mLayoutInflater.inflate(R.layout.item_fab, parent, false);
        }

        Number number = (Number) getItem(position);

        TextView numberTextView = view.findViewById(R.id.fab_text_veiw);

        numberTextView.setText("Number: " + number.getNumber());

        return view;
    }
}
