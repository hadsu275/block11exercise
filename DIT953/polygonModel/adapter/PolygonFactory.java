package DIT953.polygonModel.adapter;

import DIT953.polygonModel.shapes.*;
/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {
    public static Polygon createRectangle(int x, int y){
        return new PolygonWrapper(new Rectangle(x,y,4,2));
    }
    public static Polygon createTriangle(int x, int y){ return new PolygonWrapper(new Triangle(x,y,2,2)); }
    public static Polygon createSquare(int x, int y){ return new PolygonWrapper(new Rectangle(x,y,2,2)); }
}
