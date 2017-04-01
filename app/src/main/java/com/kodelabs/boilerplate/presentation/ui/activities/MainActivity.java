package com.kodelabs.boilerplate.presentation.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kodelabs.boilerplate.R;
import com.kodelabs.boilerplate.domain.executor.impl.ThreadExecutor;
import com.kodelabs.boilerplate.domain.repository.impl.WelcomeMessageRepository;
import com.kodelabs.boilerplate.presentation.presenters.MainPresenter;
import com.kodelabs.boilerplate.presentation.presenters.MainPresenter.View;
import com.kodelabs.boilerplate.presentation.presenters.impl.MainPresenterImpl;
import com.kodelabs.boilerplate.threading.MainThreadImpl;

public class MainActivity
        extends AppCompatActivity
        implements MainPresenter.View {

    private TextView mWelcomeTextView;
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWelcomeTextView = (TextView) findViewById(R.id.welcome_text);

        mPresenter = new MainPresenterImpl(
                ThreadExecutor.getInstance(),
                MainThreadImpl.getInstance(),
                this,
                new WelcomeMessageRepository()
        );
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void displayWelcomeMessage(String msg) {
        mWelcomeTextView.setText(msg);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mPresenter.resume();
    }
}
