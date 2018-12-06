package Observer;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Observer pattern uses three actor classes. Subject, Observer and Client.
 * Subject is an object having methods to attach and detach observers to a client object.
 * We have created an abstract class Observer and a concrete class Subject that is extending class Observer.
 */
public class Observer {
    public static void main(String[] args){
        MessageBoard board = new MessageBoard();
        Student idan = new Student("Idan");
        Student ran = new Student("Ran");
        board.addObserver(idan);
        board.addObserver(ran);
        board.changeMessage("Workshop is postponed to Wednesday" );
        board.changeMessage("The first task is in your personal site");
    }
}
