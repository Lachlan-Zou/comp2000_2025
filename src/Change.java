import java.util.List;



public class Change {
    private Stage stage;
    List<Actor> actors; 

    public Change(Stage stage) {
        this.stage = stage;
    }

    public static Actor findActorInGrid(Cell cell, List<Actor> actors) {
        for (Actor a : actors) {
            if (a.getCell().equals(cell)) {
                return a;
            }
        }
        return null;
    }



    public static String hahaha(Stage stage) {
        return "this was a better idea in my head";
    }
}