package com.example.abdulhay.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abdulhay on 09.01.18.
 */

public class HochschuleStaffAdapter extends BaseAdapter implements Filterable {

        Context c;
        CustomFilter cf;
        ArrayList<DetailsOfStaff> originalArray, tempArray;

        public HochschuleStaffAdapter ( Context c, ArrayList<DetailsOfStaff> originalArray ){
            this.c =c;
            this.originalArray=originalArray;
            this.tempArray=originalArray;

        }



        @Override
        public int getCount() {
            return originalArray.size();
        }



        @Override
        public Object getItem(int position) {

            return originalArray.get(position);
        }

        public Filter getFilter(){
            if (cf == null){
                cf = new CustomFilter();
            }
            return cf;
        }

        class CustomFilter extends Filter {


            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                if (constraint != null && constraint.length() > 0) {
                    constraint = constraint.toString().toUpperCase();
                    ArrayList <DetailsOfStaff> filters = new ArrayList <>();

                    for (int i = 0; i < tempArray.size(); i++) {
                        if (tempArray.get(i).getName().toUpperCase().contains(constraint) ||tempArray.get(i).getTelNumber().toUpperCase().contains(constraint) ||
                                tempArray.get(i).getRoom().toUpperCase().contains(constraint)  || tempArray.get(i).getEmail().toUpperCase().contains(constraint)) {
                                DetailsOfStaff ds = new DetailsOfStaff(tempArray.get(i).getName(), tempArray.get(i).getTelNumber(),tempArray.get(i).getRoom(), tempArray.get(i).getEmail());
                                filters.add(ds);
                        }
                    }
                    results.count = filters.size();
                    results.values = filters;

                }
                else
                {
                    results.count=tempArray.size();
                    results.values=tempArray;

                }
                return results;
            }
            @Override
            protected void publishResults(CharSequence constraint, FilterResults filterResults) {
                originalArray = (ArrayList<DetailsOfStaff>) filterResults.values;
                notifyDataSetChanged();
            }
        }



        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            Context context = parent.getContext();
            String staffName = originalArray.get(position).getName();
            String staffNummer = originalArray.get(position).getTelNumber();
            String staffRoom = originalArray.get(position).getRoom();
            String staffEmail = originalArray.get(position).getEmail();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=inflater.inflate( R.layout.listcell,null, false);

            TextView textView1=(TextView)row.findViewById(R.id.name);
            textView1.setText(staffName);

            TextView textView2=(TextView)row.findViewById(R.id.nummer);
            textView2.setText(staffNummer);

            TextView textView3=(TextView)row.findViewById(R.id.room);
            textView3.setText(staffRoom);

            TextView textView4=(TextView)row.findViewById(R.id.email);
            textView4.setText(staffEmail);

            return row;


        }
}
