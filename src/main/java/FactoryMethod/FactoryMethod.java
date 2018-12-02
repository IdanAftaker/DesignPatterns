package FactoryMethod;

import java.util.ArrayList;

public class FactoryMethod {

    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        String[] strArr = {"Circle",null,"Square","Rectangle", "Triangle","Circle","Circle","Square"};

        //Create the factory
        ShapeFactory factory = new ShapeFactory();
        for(String shape : strArr){
            try{
                Shape obj = factory.create(shape);
                //Store all shapes
                shapes.add(obj);
            }catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        //Draw all shapes
        System.out.println("Draw all shapes");
        for (Shape shape : shapes){
            shape.draw();
        }
        //Erase all the circles
        System.out.println("Erase all the circles");
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                shape.erase();
            }
        }
    }
}
