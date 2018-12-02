package Observer;

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
