package Prototype;

public class Point implements Cloneable{
    private int _x, _y;
    public Point () {
        this._x = 0;
        this._y = 0;
    }
    public Point (int x1, int y1){
        _x = x1;
        _y = y1;
    }
    public String toString() {
        String s = "(" + _x + "," + _y+")";
        return s;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void setX(int x) {_x = x;}
    public void setY(int y) {_y = y;}
}
