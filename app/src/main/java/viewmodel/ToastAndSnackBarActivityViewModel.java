package viewmodel;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import android.databinding.ObservableField;
import android.view.View;

import java.util.Random;

import base.BaseViewModel;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午6:48
 * Desc:
 */
public class ToastAndSnackBarActivityViewModel extends BaseViewModel {

    public final ObservableField<String> toastStr = new ObservableField<>();
    public final ObservableField<String> snackStr = new ObservableField<>();

    public ToastAndSnackBarActivityViewModel(){
    }

    public void showToast(View view){
        toastStr.set(String.valueOf(new Random().nextInt(1000)));
    }

    public void showSnackBar(View view) {
        snackStr.set(String.valueOf(new Random().nextInt(1000)));
    }
}
