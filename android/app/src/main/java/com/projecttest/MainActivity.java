package com.projecttest;

import static com.projecttest.newarchitecture.animation.AnimatedText.FIT_CENTER;
import static com.projecttest.newarchitecture.animation.Constants.FADE;
import static com.projecttest.newarchitecture.animation.Constants.SCALE;
import static com.projecttest.newarchitecture.animation.Constants.SPLASH_SLIDE_RIGHT;
import static com.projecttest.newarchitecture.animation.Splash.screenHeight;
import static com.projecttest.newarchitecture.animation.Splash.screenWidth;
import com.projecttest.newarchitecture.animation.AnimatedObject;
import com.projecttest.newarchitecture.animation.GroupAnimation;
import com.projecttest.newarchitecture.animation.ObjectAnimation;
import com.projecttest.newarchitecture.animation.SingleAnimation;
import com.projecttest.newarchitecture.animation.Splash;

import android.os.Bundle;
import android.util.Log;


import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;

public class MainActivity extends ReactActivity {

   /**
    * Returns the name of the main component registered from JavaScript. This is used to schedule
    * rendering of the component.
    */
   @Override
   protected String getMainComponentName() {
       return "projectTest";
   }

   /**
    * Returns the instance of the {@link ReactActivityDelegate}. There the RootView is created and
    * you can specify the renderer you wish to use - the new renderer (Fabric) or the old renderer
    * (Paper).
    */
   @Override
   protected ReactActivityDelegate createReactActivityDelegate() {
       return new MainActivityDelegate(this, getMainComponentName());
   }

   public static class MainActivityDelegate extends ReactActivityDelegate {
       public MainActivityDelegate(ReactActivity activity, String mainComponentName) {
           super(activity, mainComponentName);
       }

       @Override
       protected ReactRootView createRootView() {
           ReactRootView reactRootView = new ReactRootView(getContext());
           // If you opted-in for the New Architecture, we enable the Fabric Renderer.
           reactRootView.setIsFabric(BuildConfig.IS_NEW_ARCHITECTURE_ENABLED);
           return reactRootView;
       }

       public void onCreate(Bundle saved) {
           super.onCreate(saved);
           try {
               initiateSplash();
           } catch (Exception e) {
               Log.e("ANIMATED_SPLASH", e.getMessage());
           }
       }

       public void initiateSplash() throws Exception {

           // Create Splash
           Splash splash = new Splash(getContext());
           //Set Background Color To View
           splash.setBackgroundColor("#BF1E2D");
           //Set Hiding Animation for Splash
           splash.setSplashHideAnimation(SPLASH_SLIDE_RIGHT);
           //Set Delay for Splash to hide
           splash.setSplashHideDelay(1500);

           //Creating Image and adding its properties and animation

           AnimatedObject logoimage = new AnimatedObject(R.drawable.logo, screenHeight * 0.10, screenWidth * 0.1);
           splash.addAnimatedImage(logoimage);


           ObjectAnimation logoimageAnimation1 = new ObjectAnimation(logoimage, FADE, 1000, 0f, 1f, false);
           ObjectAnimation logoimageAnimation2 = new ObjectAnimation(logoimage, SCALE, 1000, 0f, 1f, 0f, 1f, false);

           AnimatedObject image1 = new AnimatedObject(R.drawable.logo, screenHeight * 0.24, screenWidth * 0.4);
           image1.setVisibility(false);
           ObjectAnimation image1Animation = new ObjectAnimation(image1, FADE, 500, 0f, 1f);
           splash.addAnimatedImage(image1);

           AnimatedObject image2 = new AnimatedObject(R.drawable.logo, screenHeight * 0.24, screenWidth + screenWidth * 0.4);
           ObjectAnimation image2Animation = new ObjectAnimation(image2, FADE, 500, 0f, 1f);
           image2.setVisibility(false);
           splash.addAnimatedImage(image2);

           AnimatedObject image3 = new AnimatedObject(R.drawable.logo, screenHeight * 0.24, screenWidth + screenWidth * 0.4);
           ObjectAnimation image3Animation = new ObjectAnimation(image3, FADE, 500, 0f, 1f);
           image3.setVisibility(false);
           splash.addAnimatedImage(image3);

           GroupAnimation group1 = new GroupAnimation(1);
           group1.addAnimation(logoimageAnimation1);
           group1.addAnimation(logoimageAnimation2);

           SingleAnimation single1  = new SingleAnimation(image1Animation,2);
           SingleAnimation single2  = new SingleAnimation(image2Animation,3);
           SingleAnimation single3  = new SingleAnimation(image3Animation,4);

           splash.ShowSplash();

       }


       
       protected boolean isConcurrentRootEnabled() {
           // If you opted-in for the New Architecture, we enable Concurrent Root (i.e. React 18).
           // More on this on https://reactjs.org/blog/2022/03/29/react-v18.html
           return BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
       }
   }
}
