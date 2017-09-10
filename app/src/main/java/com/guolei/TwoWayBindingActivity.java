package com.guolei;

//                    _    _   _ _
//__      _____  _ __| | _| |_(_) | ___
//\ \ /\ / / _ \| '__| |/ / __| | |/ _ \
// \ V  V / (_) | |  |   <| |_| | |  __/
//  \_/\_/ \___/|_|  |_|\_\\__|_|_|\___|


import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.guolei.databinding.ActivityTowayBinding;

import model.bean.User;
import viewmodel.TwoWayActivityViewModel;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午4:39
 * Desc:
 */
public class TwoWayBindingActivity extends AppCompatActivity {

    private ActivityTowayBinding mBinding;

    public static void start(Context context) {
        context.startActivity(new Intent(context,TwoWayBindingActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_toway);
    }

    private void initData() {
        TwoWayActivityViewModel viewModel = new TwoWayActivityViewModel();
        viewModel.setUser(new User());
        mBinding.setViewmodel(viewModel);
    }
}
