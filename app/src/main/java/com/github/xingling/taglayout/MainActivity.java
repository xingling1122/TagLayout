package com.github.xingling.taglayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.github.xingling.taglayoutlib.BaseTagLayout;
import com.github.xingling.taglayoutlib.TagAdapter;
import com.github.xingling.taglayoutlib.TagLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TagLayout tagLayout;
    TagAdapter mAdapter;
    List<String> mDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tagLayout = findViewById(R.id.tagLayout);
        initData();
        mAdapter = new SimpleTagAdapter(this, mDatas);
        tagLayout.setAdapter(mAdapter);
        tagLayout.setOnTagClickListener(new TagLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, BaseTagLayout parent) {
                return false;
            }
        });
    }

    private void initData() {
        mDatas.add("xl");
        mDatas.add("afweoaicnafweoaicnwofafweoaicnwofafweoaicnwofafweoaicnwofafweoaicnwofwof");
        mDatas.add("fawejoafwe");
        mDatas.add("sfenawefi");
        for (int i = 0; i < 10; i++) {
            mDatas.add("xl" + i);
        }
    }
}
