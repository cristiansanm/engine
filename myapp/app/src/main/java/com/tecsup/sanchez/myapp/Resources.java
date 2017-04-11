package com.tecsup.sanchez.myapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import java.util.HashMap;

/**
 * Created by Heat on 02/11/2016.
 */
public class Resources {

    public HashMap texturePool;
    public SoundManager sounds;
    public Context mContext;
    public int fps;
    public Canvas canvas;
    public PointF aspect;
    public String hasKey;

    public Resources (Context _context)
    {
        fps = 32;
        hasKey = "";
        mContext = _context;
        texturePool = new HashMap();
        sounds =  new SoundManager(_context);
    }
    public void loadTexture (String key, int resource){
        if (texturePool.containsKey(key))
        {
            Bitmap bmp = null;
            bmp = BitmapFactory.decodeResource(mContext.getResources(), resource);
            texturePool.put(key, bmp);
        }
    }
    public void


}
