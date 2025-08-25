package Shapes;

public abstract class Shape {
    protected int w,h;
    public void setWidth(int w){ this.w = w; }
    public void setHeight(int h){ this.h = h; }
    public abstract int area();
} 
