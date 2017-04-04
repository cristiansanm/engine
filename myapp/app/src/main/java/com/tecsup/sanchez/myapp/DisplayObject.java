package com.tecsup.sanchez.myapp;

import android.app.usage.UsageEvents;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.animation.Transformation;

/**
 * Created by Heat on 01/11/2016.
 */
public abstract class DisplayObject extends EventDispatcher {

    public int height, width;
    public float opacity, scaleX, scaleY;
    public int pivotX, pivotY, rotation;
    public Transformation transformation;
    public boolean visible;
    public int x,y;
    public DisplayObject parent;
    public Resources resources;

    public DisplayObject () {}
    public void dispatchEvent (/*Event e*/){}
    public void dispatchEvent (String e){}
    public void dispose (){}
    public Point globlalToLocal (Point p) {}
    public Point localToGlobal (Point p) {}
    public abstract void onDraw ();
    public void primaryOperations(){}
    public void touchDown (Point p, int index){}
    public void touchMove (Point p, int index){}
    public void touchUp  (Point p, int index){}






    public DisplayObject(Resources resources){
        this.resources = resources;
    }

    public void update(){

    }

    public void onTouchEvent(MotionEvent event) {

    }
}
