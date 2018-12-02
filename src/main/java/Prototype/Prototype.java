package Prototype;

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
