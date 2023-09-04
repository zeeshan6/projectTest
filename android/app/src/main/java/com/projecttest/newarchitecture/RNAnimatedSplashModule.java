
package com.projecttest.newarchitecture;

import com.projecttest.newarchitecture.animation.Splash;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNAnimatedSplashModule extends ReactContextBaseJavaModule {

  public static ReactApplicationContext reactContext;

  public RNAnimatedSplashModule(ReactApplicationContext rc) {
    super(rc);
    reactContext = rc;
  }

  @ReactMethod
  public void hide(){
    Splash.hide();

  }

  @Override
  public String getName() {
    return "RNAnimatedSplash";
  }
}