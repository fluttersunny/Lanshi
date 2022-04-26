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
        itemList.add(new Item("07:00","晨读一《人民日报》",""));
        itemList.add(new Item("09:00","概预习高等数学第二章",""));
        itemList.add(new Item("11:40","","去春熙路吃饭"));
        itemList.add(new Item("15:30","","研讨间530开会"));
        itemList.add(new Item("16:40","","练两道编程题"));
        adapter = new ItemListAdapter(this,itemList);
        timeline.setAdapter(adapter);
    }
}