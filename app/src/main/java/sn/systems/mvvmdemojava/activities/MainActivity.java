package sn.systems.mvvmdemojava.activities;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sn.systems.mvvmdemojava.R;
import sn.systems.mvvmdemojava.classes.M;
import sn.systems.mvvmdemojava.databinding.ActivityMainBinding;
import sn.systems.mvvmdemojava.interfces.LoginResultCallbacks;
import sn.systems.mvvmdemojava.viewmodel.LoginViewModel;
import sn.systems.mvvmdemojava.viewmodel.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity implements LoginResultCallbacks
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(
                this,
                new LoginViewModelFactory(this)).get(LoginViewModel.class));

    }

    @Override
    public void onSuccess(String message) {

        M.t(message);
    }

    @Override
    public void onError(String message) {

        M.t(message);
    }
}
