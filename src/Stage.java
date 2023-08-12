import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList; 


public class Stage {
    Grid grid = new Grid();
    ArrayList<Actor> actors = new ArrayList<Actor>();

    public Stage(){
        actors.add(new Cat(grid.cells[0][0]));
        actors.add(new Dog(grid.cells[2][5]));
        actors.add(new Bird(grid.cells[6][15]));
    }

    public void paint(Graphics g, Point mousePos){
        grid.paint(g, mousePos);
        for(int i = 0; i < actors.size(); i++){
            actors.get(i).paint(g); 
        }
    }
}
