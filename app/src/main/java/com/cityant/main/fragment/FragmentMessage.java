package com.cityant.main.fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.cityant.main.R;
import com.cityant.main.adapter.FragmentHomeAdapter;
import com.iloomo.base.FragmentSupport;



import java.util.ArrayList;
import java.util.List;


public class FragmentMessage extends FragmentSupport {

    private ListView mlist;
    private FragmentHomeAdapter fragmentHomeAdapter = null;

    @Override
    public View setTitleBar(View view) {
        isLeftVisibility(false);
        return super.setTitleBar(view);
    }

    @Override
    public View initView() {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_message, null);
        setTitle("消息");
//        mlist = (ListView) view.findViewById(R.id.mlist);
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            list.add("王尼玛" + i);
//        }
//        fragmentHomeAdapter = new FragmentHomeAdapter(context, list);
//        mlist.setAdapter(fragmentHomeAdapter);
//        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                startActivity(new Intent(context, ChatActivity.class));
//            }
//        });
        return view;
    }


}
