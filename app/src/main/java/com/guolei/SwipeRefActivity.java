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

import com.guolei.databinding.ActivityRefreshBinding;

import viewmodel.SwipeRefActivityViewModel;

/**
 * Created by Android Studio.
 * User: guolei
 * Email: guolei@worktile.com
 * Date: 17/9/10
 * Time: 下午2:18
 * Desc:
 */
public class SwipeRefActivity extends AppCompatActivity {

    private ActivityRefreshBinding mBinding;

    public static void start(Context context) {
        context.startActivity(new Intent(context, SwipeRefActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_refresh);
    }

    private void initData(){
        SwipeRefActivityViewModel viewModel = new SwipeRefActivityViewModel();
        mBinding.setMyviewmodel(viewModel);
    }
}
