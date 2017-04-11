package com.tecsup.sanchez.myapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno on 04/04/2017.
 */

public class EventDispatcher {

    public List listeners;
    public EventDispatcher () { listeners = new ArrayList();}
    public void addEventListener (String type){ listeners.add(type);}
    public void dispatchEvent (Event e)
    {
        if (e.target == null)
            e.target = this;
        for (int i = 0; i < listeners.size(); i++)
            if (((String) listeners.get(i)).equals(e.type))
                recieveEvent(e);
    }
    public void dispatchEvent (String type)
    {
       Event e = new Event(type);
        if (e.target == null)
            e.target = this;
        for (int i = 0; i < listeners.size(); i++ )
            if (((String) listeners.get(i)).equals(e.type))
                recieveEvent (e);

    }
    public void dispose () {}
    public void recieveEvent (Event event) {}
    public void removeEventListener (String type){listeners.remove(type);}
    public void removeEventListeners (){listeners.clear();}
}
