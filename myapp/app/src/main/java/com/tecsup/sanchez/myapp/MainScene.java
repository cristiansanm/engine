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
        //img.rotation = 0;
        img.scaleX=-1;
        //img.scaleY=-1;
        img.opacity = 1F;


        img.x = img.width;
        img2 = new Image("good1","good1",R.drawable.good1,this.resources);

        this.addChild(img);
        //this.addChild(img2);

    }

    @Override
    public void update() {

    }

}
