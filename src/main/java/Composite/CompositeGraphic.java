package Composite;

import java.util.ArrayList;

public class CompositeGraphic implements Graphic {
    private ArrayList<Graphic> childGraphics = new ArrayList<Graphic>();
    private String name;

    public CompositeGraphic(String name){
        this.name = name;
    }
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

    public void draw() {
        System.out.println(name);
        for (Graphic graphic : childGraphics) {
            graphic.draw();
        }
        System.out.println();
    }
}
