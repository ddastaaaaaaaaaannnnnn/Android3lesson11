package com.example.android3lesson1.injector;


import com.example.android3lesson1.counterapp.CounterPresenter;

public class Injector {

    public static CounterPresenter attachPresenter() {
        return new CounterPresenter();
    }

}
