package oopd_gu_chalmers;

import oopd_gu_chalmers.polygonModel.polygon.Polygon;

import javax.swing.*;
import java.util.ArrayList;

public class PlolygonModel extends JComponent {
    public ArrayList<Polygon> polygons;
    public boolean direction = true;
    public int ticker = 0;
    public JFrame frame;

    public PlolygonModel() {
        polygons = new ArrayList<>(10);
    }

    public void update() {
        ticker++;
        int value = direction ? 10 : -10;
        for (Polygon p : polygons) {
            p.updateCenter(p.getCenterX() + value, p.getCenterY() + value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
    }
}
