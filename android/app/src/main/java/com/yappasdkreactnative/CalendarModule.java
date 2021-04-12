package com.yappasdkreactnative;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.yappa.sdk.YappaSDK;

import java.util.Map;
import java.util.HashMap;

public class CalendarModule extends ReactContextBaseJavaModule {
    CalendarModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CalendarModule";
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location) {
        YappaSDK.INSTANCE.initialize("apiKey", MainApplication.AppContext); // Lo primero que se tiene que llamar antes que nada
        YappaSDK.INSTANCE.setAppId(1);
        YappaSDK.INSTANCE.setAppIcon(R.mipmap.ic_launcher);
        YappaSDK.INSTANCE.setContentUrl("https://qa-site.yappaapp.com/qa-demo/");
        YappaSDK.INSTANCE.show();
        Log.d("CalendarModule", "Create event called with name: " + name  + " and location: " + location);
    }

}