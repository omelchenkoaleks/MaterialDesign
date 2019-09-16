package com.omelchenkoaleks.materialdesign._007_cardview_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.omelchenkoaleks.materialdesign.R;

import java.util.List;


public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder>{
    private List<Person> mPersonList;
    private LayoutInflater mLayoutInflater;

    public PersonAdapter(List<Person> personList, LayoutInflater layoutInflater) {
        mPersonList = personList;
        mLayoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.card_person_item_007, parent, false);
        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        final int index = position;

        // при долгом нажатии удаляем карточку с данными одного человека
        holder.mCardView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mPersonList.remove(index);
                notifyDataSetChanged();
                return true;
            }
        });

        holder.mNameTextView.setText(mPersonList.get(position).getName());
        String age = String.valueOf(mPersonList.get(position).getAge());
        holder.mAgeTextView.setText(age);
        holder.mPositionTextView.setText(mPersonList.get(position).getPosition());
    }

    public void addData(Person person) {
        mPersonList.add(person);
        notifyDataSetChanged();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return mPersonList.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private TextView mNameTextView;
        private TextView mAgeTextView;
        private TextView mPositionTextView;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            mCardView = itemView.findViewById(R.id.card_view);
            mNameTextView = itemView.findViewById(R.id.name_text_view);
            mAgeTextView = itemView.findViewById(R.id.age_text_view);
            mPositionTextView = itemView.findViewById(R.id.position);
        }
    }
}
