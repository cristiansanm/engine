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

    public int height = 0, width = 0;
    public float opacity = 1.0f, scaleX = 1.0f, scaleY = 1.0f;
    public int pivotX  = 0, pivotY = 0, rotation = 0;
    //public Transformation transformation;
    public boolean visible = true;
    public int x =0,y = 0;
    public DisplayObject parent = null;
    public Resources resources;

    public DisplayObject () {}
    public void dispatchEvent (/*Event e*/){}
    public void dispatchEvent (String e){}
    public void dispose (){}
    public Point globlalToLocal (Point p) {return new Point();}
    public Point localToGlobal (Point p) {return new Point();}
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
