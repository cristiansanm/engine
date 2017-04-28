package com.tecsup.sanchez.myapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;


public class Image extends DisplayObject {

       public String key, tag;
    public Resources resources;
    public int source;

    public Image (String _key, String _tag, int source, Resources _resources)
    {
        key = _key; tag = _tag;
        source = source;
        resources = _resources;
        resources.loadTexture(_key,source);
        Bitmap aux = resources.getTexture(key);
        this.height = aux.getHeight();
        this.width = aux.getWidth();
    }
    @Override
    public void onDraw ()
    {
        Paint p = new Paint();
        float n = this.x-this.width*0.5f;
        float m = this.y-this.height*0.5f;
        resources.canvas.rotate(rotation);

        //resources.canvas.drawBitmap(resources.getTexture(key),n ,m , p );
        resources.canvas.drawBitmap(resources.getTexture(key), new Rect(0,0,this.width,this.height), new RectF(n,m,this.width*this.scaleX,this.height*this.scaleY), p);
        resources.canvas.rotate(-rotation);
        //resources.canvas.scale(scaleX,scaleY);


    }
    public void dispose (){}



}