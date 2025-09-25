import javax.swing.*;

class Control extends JPanel {
    private JRadioButton dogButton, catButton, birdButton;
    private ButtonGroup group;

    public Control() {
        dogButton = new JRadioButton("dog");
        catButton = new JRadioButton("cat");
        birdButton = new JRadioButton("bird");

        group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(birdButton);

        this.add(dogButton);
        this.add(catButton);
        this.add(birdButton);
    }
    public String getSelectedOption() {
      if (dogButton.isSelected()) {
        return "Dog";
      }
      if (catButton.isSelected()) {
        return "Cat";
      }
      if (birdButton.isSelected()) {
        return "Bird";
      }
      return null;
    }

}