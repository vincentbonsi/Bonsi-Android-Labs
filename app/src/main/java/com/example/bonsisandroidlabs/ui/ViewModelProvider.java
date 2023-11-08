package com.example.bonsisandroidlabs.ui;

import com.example.bonsisandroidlabs.data.MainViewModel;

import ui.MainActivity;

public class ViewModelProvider {
    public ViewModelProvider(MainActivity mainActivity, ViewModelProvider.NewInstanceFactory newInstanceFactory) {
    }

    public ViewModelProvider(MainActivity mainActivity) {
    }

    public MainViewModel get(Class<MainViewModel> mainViewModelClass) {
        return null;
    }

    public class NewInstanceFactory {
    }
}
