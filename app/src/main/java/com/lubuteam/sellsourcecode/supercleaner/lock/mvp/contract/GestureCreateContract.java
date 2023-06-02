package com.lubuteam.sellsourcecode.supercleaner.lock.mvp.contract;

import com.lubuteam.sellsourcecode.supercleaner.lock.base.BasePresenter;
import com.lubuteam.sellsourcecode.supercleaner.lock.base.BaseView;
import com.lubuteam.sellsourcecode.supercleaner.lock.model.LockStage;
import com.lubuteam.sellsourcecode.supercleaner.lock.widget.LockPatternView;

import java.util.List;

/**
 * Created by xian on 2017/2/17.
 */

public interface GestureCreateContract {

    interface View extends BaseView<MainContract.Presenter> {
        void updateUiStage(LockStage stage);

        void updateChosenPattern(List<LockPatternView.Cell> mChosenPattern);

        void updateLockTip(String text, boolean isToast);

        void setHeaderMessage(int headerMessage);

        void lockPatternViewConfiguration(boolean patternEnabled, LockPatternView.DisplayMode displayMode);

        void Introduction();

        void HelpScreen();

        void ChoiceTooShort();

        void moveToStatusTwo();

        void clearPattern();

        void ConfirmWrong();

        void ChoiceConfirmed();
    }

    interface Presenter extends BasePresenter {

        void updateStage(LockStage stage);

        void onPatternDetected(List<LockPatternView.Cell> pattern, List<LockPatternView.Cell> mChosenPattern, LockStage mUiStage);

        void onDestroy();
    }
}