import java.util.List;



public class Change {
    private Stage stage;
    List<Actor> actors; 

    public Change(Stage stage) {
        this.stage = stage;
    }

    public static Actor findActorInGrid(Stage stage, Cell cell) {
        for (Actor a : stage.actors) {
            if (a.loc.equals(cell)) {
                return a;
            }
        }
        return null;
    }

}