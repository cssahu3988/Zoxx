package com.example.rityan.utills;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefrenceService {
    private static final String s = "wqecdsfsdfSAF";

    public static boolean isLoggedIn(Context context){
        SharedPreferences preferences = context.getSharedPreferences(s,Context.MODE_PRIVATE);
        return preferences.getBoolean("isLoggedIn",false);
    }

    public static void setIsLoggedIn(Context context,boolean b){
        SharedPreferences pref = context.getSharedPreferences(s,Context.MODE_PRIVATE);
        pref.edit().putBoolean("isLoggedIn",b).apply();
    }
}
