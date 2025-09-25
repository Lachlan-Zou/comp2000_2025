import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

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
      this.setContentPane(canvas);

      JPanel controls = new JPanel();
      JRadioButton dogButton = new JRadioButton("dog");
      JRadioButton catButton = new JRadioButton("cat");
      JRadioButton birdButton = new JRadioButton("bird");

      ButtonGroup group = new ButtonGroup();
      group.add(dogButton);
      group.add(catButton);
      group.add(birdButton);

      controls.add(dogButton);
      controls.add(catButton);
      controls.add(birdButton);

      this.add(controls, BorderLayout.WEST);
      
      this.pack();
      this.setVisible(true);
      

    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
