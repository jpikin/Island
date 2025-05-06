public class App {

    public static void main(String[] args) {
    Island island = new Island();


    //Тест Удалить.
        Cell[][] field = island.getField();
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                System.out.println(cell);
            }
        }
    //Конец теста.
    }
}
