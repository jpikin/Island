

public class Island {
    private final Cell[][] field = new Cell[100][20];


    public Island() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = new Cell(i,j,isCoast(i,j));
            }
        }

    }
    private boolean isCoast(int i, int j) {
        return i < 1 || i >= field.length-1 || j < 1 || j >= field[i].length-1;
    }

    public Cell[][] getField() {
        return field;
    }
    public Cell getCell(int i, int j) {
        return field[i][j];
    }

}
