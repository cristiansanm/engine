package com.tecsup.sanchez.myapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;


public class Image extends DisplayObject {

       public String key, tag;
    public Resources resources;
    public int source;

    public Image (String _key, String _tag, int source, Resources _resources)
    {
        key = _key; tag = _tag; source = source; resources = _resources;
        _resources.loadTexture(_key,source);
        Bitmap aux = resources.getTexture(key);
        this.height = aux.getHeight();
        this.width = aux.getWidth();
    }
    public void onDraw ()
    {

        Paint p = new Paint();
        float n = this.x-this.width*0.5f;
        float m = this.y-this.height*0.5f;
        resources.canvas.drawBitmap(resources.getTexture(key),n ,m , p );

    }
    public void dispose (){}



}