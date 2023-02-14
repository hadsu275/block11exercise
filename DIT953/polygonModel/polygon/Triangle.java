package DIT953.polygonModel.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
class Triangle extends AbstractPolygon {
    Triangle(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g){
        g.drawLine(getCenterX(), getCenterY()-10, getCenterX()-10, getCenterY()+10);
        g.drawLine(getCenterX()-10, getCenterY()+10,
                getCenterX()+10, getCenterY()+10);
        g.drawLine(getCenterX()+10, getCenterY()+10, getCenterX(), getCenterY()-10);
    }
}
