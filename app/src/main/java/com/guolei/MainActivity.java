package com.guolei;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guolei.databinding.ActivityMainBinding;

import viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    private void initData(){
        MainActivityViewModel mViewModel = new MainActivityViewModel();
        mBinding.setViewmodel(mViewModel);
    }
}