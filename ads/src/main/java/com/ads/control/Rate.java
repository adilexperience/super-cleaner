package com.ads.control;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AlertDialog;

import com.ads.control.funtion.UtilsApp;


public class Rate {

    public static void Show(final Context mContext, OnResult mOnResult) {
        try {
            if (UtilsApp.isConnectionAvailable(mContext)) {
                if (!PreferenceManager.getDefaultSharedPreferences(mContext).getBoolean("Show_rate", false)) {
                    RateApp a = new RateApp(mContext, mContext.getString(R.string.email_feedback), mContext.getString(R.string.Title_email),  mOnResult);
                    a.getWindow().getAttributes().windowAnimations = R.style.DialogTheme;
                    a.show();
                } else {
                    if (mOnResult != null)
                        mOnResult.callActionAfter();
                }

            } else {
                if (mOnResult != null)
                    mOnResult.callActionAfter();
            }

        } catch (Exception e) {
            e.printStackTrace();
            if (mOnResult != null)
                mOnResult.callActionAfter();
        }

    }

    public interface OnResult {
        void callActionAfter();
    }
}
