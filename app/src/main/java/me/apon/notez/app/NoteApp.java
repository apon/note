package me.apon.notez.app;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;

import net.danlew.android.joda.JodaTimeAndroid;

import me.apon.notez.BuildConfig;


/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: me.apon.notez.app.NoteApp.java
 * @author: yaopeng(aponone@gmail.com)
 * @date: 2018-01-26
 */

public class NoteApp extends Application{

    public static NoteApp app;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init(){
        if (BuildConfig.DEBUG){
            LeakCanary.install(this);
            Stetho.initializeWithDefaults(this);
        }
        app = this;
        //Logger.addLogAdapter(new AndroidLogAdapter());
        JodaTimeAndroid.init(this);
    }
}
