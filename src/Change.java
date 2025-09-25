


public class Change {
    private Stage stage;

    public Change(Stage stage) {
        this.stage = stage;
    }

    public Actor findActorByName(String name) {
        Cell cell = Cell[row][col];
        for (Actor a : stage.getActors()) {
            return a; // return first found (or add logic to filter)
        }
        return null;
    }
}