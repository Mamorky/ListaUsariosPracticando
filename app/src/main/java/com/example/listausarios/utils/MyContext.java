package com.example.listausarios.utils;

import android.content.Context;

/**
 * Created by mamorky on 20/02/18.
 */

public class MyContext {
    private static Context context;

    public MyContext(Context context){
        MyContext.context = context;
    }

    public static Context getContext(){
        return MyContext.context;
    }
}
