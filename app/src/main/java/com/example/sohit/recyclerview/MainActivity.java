package com.example.sohit.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_list_recycleview);

        List<ViewData> dataList=new ArrayList<ViewData>();

        ViewData viewData=new ViewData();
        viewData.setTitle("title1");
        viewData.setDescription("description 1");

        dataList.add(viewData);

        viewData=new ViewData();
        viewData.setTitle("title2");
        viewData.setDescription("description 2");

        dataList.add(viewData);


        viewData=new ViewData();
        viewData.setTitle("title3");
        viewData.setDescription("description 3");

        dataList.add(viewData);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        rv.setAdapter(new CurrentListAdapter(dataList));














    }





}
