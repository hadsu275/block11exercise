package DIT953.polygonModel.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
class Square extends AbstractPolygon {
    Square(int x, int y) {
        super(x,y);
    }

   @Override
    public void paint(Graphics g){
        g.drawRect(getCenterX() - 10, getCenterY() - 10, 20, 20);
    }
}
