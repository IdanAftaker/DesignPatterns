package Composite;

public class Circle implements Graphic {
    int number;
    public Circle(int n){
        this.number = n;
    }
    public void draw() {
        System.out.println("Circle No: "+number);
    }
}
