package com.example.abdulhay.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Staff2Activity extends AppCompatActivity  implements TextWatcher{
    HochschuleStaffAdapter adapterr;

    ArrayList<DetailsOfStaff> mylist;
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff2);

        Intent intent = getIntent();

        EditText et = (EditText) findViewById(R.id.editText);
        ListView lv = (ListView) findViewById(R.id.listView);
        DB_departments db = MainActivity.dp;
        et.addTextChangedListener(this);
        lv.setTextFilterEnabled(true);


        mylist = new ArrayList <>();
        DetailsOfStaff ds;

        for (int i=0; i<db.getDepartments_NAMELIST().size(); i++){
            ds = new DetailsOfStaff(db.getDepartments_NAMELIST().get(i),db.getDepartments_NUMLIST().get(i),db.getDepartments_ROOMLIST().get(i),db.getDepartments_EMAILLIST().get(i));
            mylist.add(ds);
        }
        adapterr = new HochschuleStaffAdapter(this, mylist);

        lv.setAdapter(adapterr);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    this.adapterr.getFilter().filter(s);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }







}
