package me.daylight.talk.app;

import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
    }

    public static MyApplication getApplication(){
        return application;
    }

}
