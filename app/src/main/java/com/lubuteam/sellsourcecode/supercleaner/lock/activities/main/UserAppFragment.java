package com.lubuteam.sellsourcecode.supercleaner.lock.activities.main;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lubuteam.sellsourcecode.supercleaner.R;
import com.lubuteam.sellsourcecode.supercleaner.lock.adapters.MainAdapter;
import com.lubuteam.sellsourcecode.supercleaner.lock.base.BaseFragment;
import com.lubuteam.sellsourcecode.supercleaner.lock.model.CommLockInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xian on 2017/3/1.
 */

public class UserAppFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    @Nullable
    private List<CommLockInfo> data, list;
    @Nullable
    private MainAdapter mMainAdapter;

    @NonNull
    public static UserAppFragment newInstance(List<CommLockInfo> list) {
        UserAppFragment userAppFragment = new UserAppFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) list);
        userAppFragment.setArguments(bundle);
        return userAppFragment;
    }

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_lock_app_list;
    }

    @Override
    protected void init(View rootView) {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        data = getArguments().getParcelableArrayList("data");
        mMainAdapter = new MainAdapter(getContext());
        mRecyclerView.setAdapter(mMainAdapter);
        list = new ArrayList<>();
        for (CommLockInfo info : data) {
            if (!info.isSysApp()) {
                list.add(info);
            }
        }
        mMainAdapter.setLockInfos(list);
    }
}