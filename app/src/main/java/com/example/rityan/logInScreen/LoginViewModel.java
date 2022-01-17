package com.example.rityan.logInScreen;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class LoginViewModel extends AndroidViewModel {
    int typeOfAnimation = 1;

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public void setTypeOfAnimation(int typeOfAnimation) {
        this.typeOfAnimation = typeOfAnimation;
    }
    public int getTypeOfAnimation() {
        return typeOfAnimation;
    }

    public class OnClickMethods{
        public void logInGoogle(){
            GoogleLogin g = new GoogleLogin();
        }
        public void logInFaceBook(){

        }
        public void logInPhone(){

        }

        private class GoogleLogin {

        }

    }


}
