package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView timeline;
    private List<Item> itemList = new ArrayList<>(10);
    private ItemListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initData();
    }

    private void findView() {
        timeline = findViewById(R.id.timeline);
    }

    private void initData() {
        itemList.add(new Item("08:00","微积分",""));
        itemList.add(new Item("09:50","概率论",""));
        itemList.add(new Item("14:00","","学习C++"));
        itemList.add(new Item("16:00","","散步"));
        adapter = new ItemListAdapter(this,itemList);
        timeline.setAdapter(adapter);
    }
}