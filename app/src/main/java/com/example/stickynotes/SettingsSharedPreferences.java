package com.example.stickynotes;

import android.content.Context;
import android.content.SharedPreferences;


class SettingsSharedPreferences {


    SharedPreferences sharedPref;

    static final String MyPREFERENCES = "com.example.stickynotes_preferences" ;



    SettingsSharedPreferences(Context context) { //constructor

        sharedPref = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

    }


    int getFontColor() {


        return sharedPref.getInt("fontColor", -255255255); //defValue - default value


    }


    int getFontSize() {

        return sharedPref.getInt("fontSizeSeekBar", 40);


    }

    int getBackgroundColor() {


        return sharedPref.getInt("backgroundColor", -14654801);


    }





}