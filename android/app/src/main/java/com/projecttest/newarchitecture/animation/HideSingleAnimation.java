package com.projecttest.newarchitecture.animation;

import static com.projecttest.newarchitecture.animation.Constants.SINGLE;

import com.projecttest.newarchitecture.AnimationsList;
import com.projecttest.newarchitecture.HideAnimationList;

public class HideSingleAnimation {

    public String type = SINGLE;
    public int priority = 0;
    public HideSingleAnimation(ObjectAnimation object,int priority) {
        object.hidePriority = priority;
        HideAnimationList.appendInAnimationList(object);
    }
}
