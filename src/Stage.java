import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;


public class Stage {
    Grid grid = new Grid();
    Actor[] actors = new Actor[3];

    public Stage(){
        actors[0] = new Cat(grid.cells[0][0]);
    }

    public void paint(Graphics g, Point mousePos){
        grid.paint(g, mousePos);
        actors[0].paint(g);
    }
}
