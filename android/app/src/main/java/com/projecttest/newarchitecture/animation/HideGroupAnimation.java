package com.projecttest.newarchitecture.animation;


import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;
import static com.projecttest.newarchitecture.animation.Constants.GROUP;

import com.projecttest.newarchitecture.AnimationsList;
import com.projecttest.newarchitecture.HideAnimationList;

public class HideGroupAnimation {
    public String type = GROUP;
    public int priority = 0;
    private List<ObjectAnimation> group = new ArrayList<>();

    public HideGroupAnimation(int priority) {
        this.priority = priority;
    }

    public void addAnimation(ObjectAnimation object){
        object.hidePriority = priority;
        HideAnimationList.appendInAnimationList(object);
    }
}