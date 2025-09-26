import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Optional;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static Control controls;
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      Stage stage = new Stage();

      public Canvas(Control controls) {
        setPreferredSize(new Dimension(1024, 720));
        
        addMouseListener(new MouseAdapter() {
          @Override

          public void mouseClicked(MouseEvent e) {
            Point point = e.getPoint();
            Optional<Cell> clickedCell = stage.grid.cellAtPoint(point);

            if (clickedCell.isPresent()) {
              Cell cell = clickedCell.get();
              String option = controls.getSelectedOption();
              Actor newActor = null;

              // If an option is selected
              if (null != option) {
                switch (option) {
                    case "Cat":
                        newActor = new Cat(cell);
                        break;
                    case "Dog":
                        newActor = new Dog(cell);
                        break;
                    case "Bird":
                        newActor = new Bird(cell);
                        break;
                    default:
                        break;
                }
              }

              // Find if the actor in the cell already exists
              Actor existing = Change.findActorInGrid(stage, cell);
              if (existing != null) {
                  stage.actors.remove(existing);  // remove old one
              }

              if (newActor != null) {
                  stage.actors.add(newActor); // add to the stage
                  repaint();    
              }
            }
          }
        });
      }

      @Override
      public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(new BorderLayout());

      Control controls = new Control();
      this.add(controls, BorderLayout.EAST);
      controls.setLayout(new BoxLayout(controls, BoxLayout.Y_AXIS));

      Canvas canvas = new Canvas(controls);
      this.add(canvas, BorderLayout.CENTER);
      //this.setContentPane(canvas);



      String choice = controls.getSelectedOption();
      System.out.println("You picked: " + choice);
      
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
