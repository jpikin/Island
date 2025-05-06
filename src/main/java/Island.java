import java.util.ArrayList;
import java.util.List;

public class Island {
    private final Cell[][] field = new Cell[100][20];

    public Island() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = new Cell(i,j);
            }
        }
    }


    public Cell[][] getField() {
        return field;
    }
}
