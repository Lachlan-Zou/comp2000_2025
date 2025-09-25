import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {

    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      Stage stage = new Stage();
      public Canvas() {
        setPreferredSize(new Dimension(1024, 720));
      }

      @Override
      public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(new BorderLayout());

      Canvas canvas = new Canvas();
      this.add(canvas, BorderLayout.CENTER);
      //this.setContentPane(canvas);

      Control controls = new Control();
      this.add(controls, BorderLayout.EAST);
      controls.setLayout(new BoxLayout(controls, BoxLayout.Y_AXIS));

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
