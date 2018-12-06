package Prototype;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * This pattern involves implementing a prototype interface which tells to create a clone of the current object.
 * This pattern is used when creation of object directly is costly.
 * For example, an object is to be created after a costly database operation.
 * We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
 */

public class Prototype {
    public static void checkPoint(){
        Point p1 = new Point(3,4), p2 = null;
        try {
            p2 = (Point)p1.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("before p1="+p1.toString()); // (3,4)
        System.out.println("before p2="+p2.toString()); // (3,4)
        p1.setX(77);
        p2.setY(199);
        System.out.println();
        System.out.println("after p1="+p1.toString()); // (77,4)
        System.out.println("after p2="+p2.toString()); // (3,199)
    }
    public static void checkNewInstance() throws InstantiationException, IllegalAccessException {
        Point p1 = new Point(3,4), p2 = null;
        p2 = p1.getClass().newInstance();
        System.out.println("p1 = " + p1); // (3,4)
        System.out.println("p2 = " + p2); // (0,0)
        p1.setY(44);
        System.out.println();
        System.out.println("p1 = " + p1); // (3,44)
        System.out.println("p2 = " + p2); // (0,0)

        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("checkPoint:");
        checkPoint();
        System.out.println("\ncheckNewInstance");
        try {
            checkNewInstance();
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
