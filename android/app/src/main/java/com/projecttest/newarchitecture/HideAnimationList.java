package com.projecttest.newarchitecture;

import com.projecttest.newarchitecture.animation.AnimatedObject;
import com.projecttest.newarchitecture.animation.ObjectAnimation;

import java.util.HashMap;
import java.util.UUID;

public class HideAnimationList {
    public static HashMap<String, ObjectAnimation> hideAnimationsList = new HashMap<>();
    public static String hideAnimationListTail = null;
    public static String hideAnimationListHead = null;

    public static void appendInAnimationList(ObjectAnimation object){
        String uniqueID = UUID.randomUUID().toString();
        if(hideAnimationsList.isEmpty()){
            hideAnimationListHead = uniqueID;
        }else{
            hideAnimationsList.get(hideAnimationListTail).setHideNext(uniqueID);
        }
        hideAnimationsList.put(uniqueID,object);
        hideAnimationListTail = uniqueID;
    }
}
