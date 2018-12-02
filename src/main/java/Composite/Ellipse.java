package Composite;

public class Ellipse implements Graphic {
    int number;
    public Ellipse(int n){
        this.number = n;
    }
    public void draw() {
        System.out.println("Ellipse No: "+number);
    }
}
