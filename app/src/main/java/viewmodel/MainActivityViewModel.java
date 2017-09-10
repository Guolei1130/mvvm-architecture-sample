package viewmodel;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import android.view.View;

import baseusage.SwipeRefActivity;
import baseusage.ToastAndSnackBarActivity;
import baseusage.TwoWayBindingActivity;

import base.BaseViewModel;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午1:52
 * Desc:
 */
public class MainActivityViewModel extends BaseViewModel {

    public void startSwipeRefView(View view) {
        SwipeRefActivity.start(view.getContext());
    }

    public void startTwowayView(View view) {
        TwoWayBindingActivity.start(view.getContext());
    }
    public void startToastAndSnackBarView(View view) {
        ToastAndSnackBarActivity.start(view.getContext());
    }
}
