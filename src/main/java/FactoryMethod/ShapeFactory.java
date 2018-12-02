package FactoryMethod;

public class ShapeFactory {
    public Shape create(String type){
        if (type == null) throw new RuntimeException("null Shape Creation: ");
        if (type.equals("Circle")) return new Circle();
        if (type.equals("Rectangle")) return new Rectangle();
        if (type.equals("Square")) return new Square();
        throw new RuntimeException("Bad shape creation: " + type);
    }
}
