package com.projecttest.newarchitecture.animation;

import static com.projecttest.newarchitecture.AnimationsList.animationsList;
import static com.projecttest.newarchitecture.animation.Constants.SINGLE;
import static com.projecttest.newarchitecture.animation.Splash.animatedObjectList;
import static com.projecttest.newarchitecture.animation.Splash.priority;

import com.projecttest.newarchitecture.AnimationsList;
import com.projecttest.newarchitecture.ListItem;

import java.util.ArrayList;
import java.util.List;


public class SingleAnimation {

    public String type = SINGLE;
    public int priority = 0;
    public SingleAnimation(ObjectAnimation object,int priority) {
        object.priority = priority;
        AnimationsList.appendInAnimationList(object);
    }
}
