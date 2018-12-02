package Observer;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
    String name;
    public Student(String name){
        this.name = name;
    }
    public void update(Observable o, Object arg) {
        System.out.println(name+": My Message board changed: " + arg);
    }
}
