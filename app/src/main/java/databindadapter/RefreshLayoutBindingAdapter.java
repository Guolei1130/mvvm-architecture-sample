package databindadapter;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import android.databinding.BindingAdapter;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.IdRes;
import android.support.v4.widget.SwipeRefreshLayout;

import base.BaseViewModel;
import base.LoadDataListener;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午2:27
 * Desc:
 */
public class RefreshLayoutBindingAdapter {

    @BindingAdapter("android:listener")
    public static <T extends LoadDataListener> void setOnRefreshListener(SwipeRefreshLayout refreshLayout, final T listener) {
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (listener != null) {
                    listener.refresh();
                }
            }
        });
    }

}
