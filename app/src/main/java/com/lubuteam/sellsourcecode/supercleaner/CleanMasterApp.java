package com.lubuteam.sellsourcecode.supercleaner;

import com.ads.control.AdmobHelp;
import com.ads.control.AdsApplication;
import com.lubuteam.sellsourcecode.supercleaner.screen.BaseActivity;
import com.lubuteam.sellsourcecode.supercleaner.screen.main.MainActivity;
import com.lubuteam.sellsourcecode.supercleaner.utils.PreferenceUtils;
import com.lubuteam.sellsourcecode.supercleaner.lock.activities.lock.GestureUnlockLockActivity;
import com.lubuteam.sellsourcecode.supercleaner.lock.utils.SpUtil;
import com.security.applock.App;
import com.security.applock.utils.PreferencesHelper;

import java.util.ArrayList;
import java.util.List;

public class CleanMasterApp extends AdsApplication {
    private static String mAuth = "436F70797269676874206279204C7562755465616D2E636F6D5F2B3834393731393737373937";

    private static List<BaseActivity> activityList;

    private static CleanMasterApp instance;

    public static CleanMasterApp getInstance() {
        return instance;
    }

    private synchronized static void setInstance(CleanMasterApp instance) {
        CleanMasterApp.instance = instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (instance == null)
            setInstance(CleanMasterApp.this);
        App.getInstace().init(this);
        AdmobHelp.getInstance().init(this);
        PreferenceUtils.init(this);
        PreferencesHelper.init(this);
        if (PreferenceUtils.getTimeInstallApp() == 0)
            PreferenceUtils.setTimeInstallApp(System.currentTimeMillis());
        SpUtil.getInstance().init(instance);
        activityList = new ArrayList<>();
    }

    public void doForCreate(BaseActivity activity) {
        activityList.add(activity);
    }

    public void doForFinish(BaseActivity activity) {
        activityList.remove(activity);
    }

    public BaseActivity getTopActivity() {
        if (activityList.isEmpty())
            return null;
        return activityList.get(activityList.size() - 1);
    }

    public void clearAllActivity() {
        for (BaseActivity activity : activityList) {
            if (activity != null && !(activity instanceof GestureUnlockLockActivity))
                activity.clear();
        }
        activityList.clear();
    }

    public List<BaseActivity> getActivityList() {
        return activityList;
    }

    public void clearAllActivityUnlessMain() {
        for (BaseActivity activity : activityList) {
            if (activity != null && !(activity instanceof MainActivity))
                activity.clear();
        }
        activityList.clear();
    }

}
