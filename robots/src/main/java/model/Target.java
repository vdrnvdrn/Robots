package model;

import java.awt.*;

public class Target {
    private volatile int x;
    private volatile int y;

    public Target() {
        this.x = 100;
        this.y = 100;
    }

    public Target(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setTargetPosition(Point p) {
        setX(p.x);
        setY(p.y);
    }



    public boolean isPositionCorrect(Dimension dimension) {
        return this.x <= dimension.width && this.y <= dimension.height;
    }

}