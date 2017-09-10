package viewmodel;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import android.databinding.Bindable;
import android.databinding.ObservableBoolean;

import com.guolei.BR;

import base.BaseViewModel;
import base.LoadDataListener;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import model.SwipeRefModel;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午2:40
 * Desc:
 */
public class SwipeRefActivityViewModel extends BaseViewModel implements LoadDataListener {

    public final ObservableBoolean loading = new ObservableBoolean(false);

    @Override
    public void refresh() {
        loading.set(true);
        SwipeRefModel.getInstance().mockRefresh()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        loading.set(false);
                    }
                });
    }

    @Override
    public void loadMore() {

    }


}
