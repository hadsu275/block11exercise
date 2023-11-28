package oopd_gu_chalmers.polygonModel.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
class Rectangle extends AbstractPolygon {
    Rectangle(int x, int y) {
        super(x,y);
    }

    public void paint(Graphics g){
        g.drawRect(getCenterX() -20, getCenterY() -10, 40, 20);
    }
}
