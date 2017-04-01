package com.kodelabs.boilerplate.threading;

import com.kodelabs.boilerplate.domain.executor.MainThread;

/**
 * Created by akruglov on 01.04.17.
 */

public class TestMainThread implements MainThread {

    @Override
    public void post(Runnable runnable) {
        runnable.run();
    }
}
