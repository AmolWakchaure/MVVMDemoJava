package sn.systems.mvvmdemojava.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import sn.systems.mvvmdemojava.interfces.LoginResultCallbacks;
import sn.systems.mvvmdemojava.model.User;

public class LoginViewModel extends ViewModel
{
    private User user;
    private LoginResultCallbacks loginResultCallbacks;

    public LoginViewModel(LoginResultCallbacks loginResultCallbacks)
    {
        this.loginResultCallbacks = loginResultCallbacks;
        this.user = new User();
    }
    //Write method to get Email from editext and set to user
    public TextWatcher getEmailTextWatcher()
    {
        return new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {


                user.setEmail(editable.toString());
            }
        };
    }
    //Write method to get Password from editext and set to user
    public TextWatcher getPasswordTextWatcher()
    {
        return new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {


                user.setPassword(editable.toString());
            }
        };
    }

    //Write method to process login
    public void onLoginClicked(View view)
    {
        if(user.isValidData())
            loginResultCallbacks.onSuccess("Login success");
        else
            loginResultCallbacks.onError("Login error");


    }
}
