import java.awt.Graphics;

public class Grid {
    int x;
    int y;
    Cell cell;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
        Cell[][] gridCells = new Cell[20][20];
        for (int i = 0; i<gridCells.length; i++) {
            for (int j =0; j<gridCells[i].length; j++) {
                gridCells[i][j] = new Cell(x+(i*35), y+(i*35), 35, 35);
            }
        }
    }

    //int size = Cell.size;

    public void drawGrid(Graphics g) {
        for (int i = 0; i<20; i++) {
            for (int j = 0; j<20;j++) {
                g.drawRect(10+(j*35), 10+(i*35), 35, 35);
            }
        }
    }
}