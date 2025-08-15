import java.awt.Graphics;

public class Cell {
    int x=0;
    int y=0;
    int size=0;

    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void drawCell(Graphics g) {
        g.drawRect(x,y,size,size);
    }
}