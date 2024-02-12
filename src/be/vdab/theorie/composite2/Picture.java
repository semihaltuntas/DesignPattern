package be.vdab.theorie.composite2;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic{
    private List<Graphic> graphics = new ArrayList<>();


    public void add( Graphic graphic){
        graphics.add(graphic);
    }
    @Override
    public void draw() {
        System.out.println("drawing a picture");
        for (var graphic : graphics){
            graphic.draw();
        }
    }
}
