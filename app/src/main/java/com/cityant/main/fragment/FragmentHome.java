package com.cityant.main.fragment;


import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;

import com.cityant.main.R;
import com.cityant.main.adapter.FragmentHomeAdapter;
import com.iloomo.base.FragmentSupport;
import com.iloomo.threadpool.MyThreadPool;
import com.iloomo.widget.PullToRefresh.NOViewPagerPullableListView;
import com.iloomo.widget.PullToRefresh.PullToRefreshLayout;



import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends FragmentSupport {


    private NOViewPagerPullableListView mlist;
    private FragmentHomeAdapter fragmentHomeAdapter = null;
    private PullToRefreshLayout pullview;

    @Override
    public View setTitleBar(View view) {
        isLeftVisibility(false);
        return super.setTitleBar(view);
    }

    @Override
    public View initView() {
        final View view = LayoutInflater.from(context).inflate(R.layout.fragment_home, null);
        setTitle("主页");
//        mlist = (NOViewPagerPullableListView) view.findViewById(R.id.mlist);
//        pullview = (PullToRefreshLayout) view.findViewById(R.id.pullview);
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            list.add("暴走啦" + i + " imei:" + ((TelephonyManager) context.getSystemService(context.TELEPHONY_SERVICE)).getDeviceId());
//        }
//        fragmentHomeAdapter = new FragmentHomeAdapter(context, list);
//        mlist.setAdapter(fragmentHomeAdapter);
//        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                startActivity(new Intent(context, ShopActivity.class));
//            }
//        });
//        pullview.setOnRefreshListener(new PullToRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh(PullToRefreshLayout pullToRefreshLayout) {
//                MyThreadPool.getInstance().submit(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            Thread.sleep(5000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        Message message = new Message();
//                        message.what = 1;
//                        handler.sendMessage(message);
//                    }
//                });
//            }
//
//            @Override
//            public void onLoadMore(PullToRefreshLayout pullToRefreshLayout) {
//                MyThreadPool.getInstance().submit(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            Thread.sleep(5000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        Message message = new Message();
//                        message.what = 0;
//                        handler.sendMessage(message);
//                    }
//                });
//            }
//        });
        return view;
    }


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    pullview.refreshFinish(pullview.SUCCEED);
                    break;
                case 0:
                    pullview.loadmoreFinish(pullview.SUCCEED);
                    break;
            }
        }
    };

}
