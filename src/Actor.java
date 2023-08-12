import java.awt.Graphics;
import java.awt.Color;

public class Actor {
    Cell drawCell;  //cell that the actor is drawn on
    Color fillColor;

    Actor(Cell cell){
        this.drawCell = cell; 
    }
    
    public void paint(Graphics g){
        g.setColor(fillColor);
        g.fillRect(drawCell.x, drawCell.y, drawCell.width, drawCell.height);
        g.setColor(Color.BLACK);
        g.drawRect(drawCell.x, drawCell.y, drawCell.width, drawCell.height);
    }

}
