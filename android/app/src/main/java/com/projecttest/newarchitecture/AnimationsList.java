package com.projecttest.newarchitecture;

import com.projecttest.newarchitecture.animation.AnimatedObject;
import com.projecttest.newarchitecture.animation.ObjectAnimation;

import java.util.HashMap;
import java.util.UUID;

public  class AnimationsList {

    public static HashMap<String, ObjectAnimation> animationsList = new HashMap<>();
    public static String animationListTail = null;
    public static String animationListHead = null;

    public static void appendInAnimationList(ObjectAnimation object){
        String uniqueID = UUID.randomUUID().toString();
        if(animationsList.isEmpty()){
            animationListHead = uniqueID;
        }else{
            animationsList.get(animationListTail).setNext(uniqueID);
        }
        animationsList.put(uniqueID,object);
        animationListTail = uniqueID;
    }
}
