package oopd_gu_chalmers.polygonModel.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public interface Polygon {
    void paint(Graphics g);
    void updateCenter(int newX, int newY);
    int getCenterX();
    int getCenterY();
}
