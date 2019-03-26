package sn.systems.mvvmdemojava.model;

import android.databinding.BaseObservable;
import android.text.TextUtils;
import android.util.Patterns;

import sn.systems.mvvmdemojava.R;

public class User extends BaseObservable
{
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.emailid);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.passid);
    }

    public boolean isValidData()
    {
        return !TextUtils.isEmpty(getEmail())
                && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                && getPassword().length() > 6;
    }

}

