package baseusage;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.guolei.R;
import com.guolei.databinding.ActivityToastAndSnackBinding;

import viewmodel.ToastAndSnackBarActivityViewModel;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午6:47
 * Desc:
 */
public class ToastAndSnackBarActivity extends AppCompatActivity {

    private ActivityToastAndSnackBinding mBinding;
    private ToastAndSnackBarActivityViewModel mViewModel;

    public static void start(Context context) {
        context.startActivity(new Intent(context,ToastAndSnackBarActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
        initPropertyCallback();
    }

    private void initView() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_toast_and_snack);
    }

    private void initData() {
        mViewModel = new ToastAndSnackBarActivityViewModel();
        mBinding.setViewmodel(mViewModel);
    }

    private void initPropertyCallback() {
        mViewModel.toastStr.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                Toast.makeText(ToastAndSnackBarActivity.this, mViewModel.toastStr.get(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        mViewModel.snackStr.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                Snackbar.make(mBinding.tvParent,mViewModel.snackStr.get(),Snackbar.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
