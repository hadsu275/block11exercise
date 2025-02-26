package oopd_gu_chalmers;

/* This is now all we (can) use from the sub-package */
import oopd_gu_chalmers.polygonModel.polygon.Polygon;
import oopd_gu_chalmers.polygonModel.polygon.PolygonFactory;

/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the oopd_gu_chalmers.model.shapes package.
 */
//import oopd_gu_chalmers.polygonModel.adapter.*;

import javax.swing.*;
import java.awt.Graphics;
import java.util.*;

public class DrawPolygons extends PlolygonModel {

    public DrawPolygons(){
        super();

        polygons.add(PolygonFactory.createSquare(50,50));
        polygons.add(PolygonFactory.createTriangle(100,100));
        polygons.add(PolygonFactory.createRectangle(50,150));

    }//constructor

    @Override
    public void paint(Graphics g) {
        for (Polygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        polygons.frame = frame;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);


        try {
            while (true) {
                Thread.sleep(500);
                polygons.update();
                frame.repaint();
            }
        } catch (InterruptedException e) {}

    }//main

}//oopd_gu_chalmers.DrawPolygons