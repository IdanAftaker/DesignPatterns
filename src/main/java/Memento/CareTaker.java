package Memento;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<MementoObject> mementoList = new ArrayList<MementoObject>();
    public void add(MementoObject state) { mementoList.add(state); }
    public MementoObject get(int index){ return mementoList.get(index); }
    public String toString(){
        String ans = "";
        for (int i = 0; i < mementoList.size(); i++) {
            ans = ans + mementoList.get(i) + ", ";
        }
        return ans;
    }
}
