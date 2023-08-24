import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Polygon;

public abstract class Actor {
  Cell loc;
  ArrayList<Polygon> polygons = new ArrayList<Polygon>();

  public void paint(Graphics g) {
   for(Polygon shape : polygons){
      g.drawPolygon(shape);
   }
   
   
   /*  g.setColor(color);
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10); */
  }
}
