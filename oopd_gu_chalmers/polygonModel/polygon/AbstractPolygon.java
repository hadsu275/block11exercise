package oopd_gu_chalmers.polygonModel.polygon;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
abstract class AbstractPolygon extends JComponent implements Polygon {
    private Point centerPoint;

    AbstractPolygon(Point center){
        this.centerPoint = center;
    }
    AbstractPolygon(int x, int y){
        this(new Point(x,y));
    }

    public void updateCenter(int x, int y){
        this.centerPoint = new Point(x,y);
    }
    public int getCenterX(){
        return centerPoint.x;
    }
    public int getCenterY() { return centerPoint.y; }


    @Override
    public abstract void paint(Graphics g)//paint
    ;
}
