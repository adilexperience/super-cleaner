package com.lubuteam.sellsourcecode.supercleaner.lock.mvp.contract;

import android.content.Context;

import com.lubuteam.sellsourcecode.supercleaner.lock.base.BasePresenter;
import com.lubuteam.sellsourcecode.supercleaner.lock.base.BaseView;
import com.lubuteam.sellsourcecode.supercleaner.lock.model.CommLockInfo;
import com.lubuteam.sellsourcecode.supercleaner.lock.mvp.p.LockMainPresenter;

import java.util.List;

/**
 * Created by xian on 2017/2/17.
 */

public interface LockMainContract {
    interface View extends BaseView<Presenter> {

        void loadAppInfoSuccess(List<CommLockInfo> list);

        void showProgressbar(boolean isShow);
    }

    interface Presenter extends BasePresenter {
        void loadAppInfo(Context context);

        void searchAppInfo(String search, LockMainPresenter.ISearchResultListener listener);

        void onDestroy();
    }
}
