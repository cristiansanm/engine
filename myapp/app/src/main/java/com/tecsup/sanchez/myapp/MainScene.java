package com.tecsup.sanchez.myapp;
/**
 * Created by Heat on 01/11/2016.
 */
public class MainScene extends DisplayContainer{

    Resources resources;
    Image img,img2;
    public MainScene(Resources resources){

        super();
        this.resources = resources;
        img = new Image("bad","bad",R.drawable.bad1,this.resources);
        img.rotation = 45;
        img.scaleX=5;
        img.scaleY=2;
        img2 = new Image("good1","good1",R.drawable.good1,this.resources);

        this.addChild(img);
        this.addChild(img2);

    }

    @Override
    public void update() {

    }

}
