package FactoryMethod;

import java.util.ArrayList;
/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Factory pattern is one of the most used design patterns in Java.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface
 */
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
