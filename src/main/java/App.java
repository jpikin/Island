import java.util.Random;



public class App {

    public static void main(String[] args) {
    Island island = new Island();
    createALife(island);

    //test(island);



    }

    private static void test(Island island) {
        //Тест Удалить.
        Cell[][] field = island.getField();
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                System.out.println(cell);
            }
        }
        System.out.println("-------------------");
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                if (cell.isPopulated())
                    System.out.println(cell);
            }
        }

        //Конец теста.
    }

    private static void createALife(Island island) {
        Cell[][] field = island.getField();
        while(true){
        Cell animalPosition = island.getCell(new Random().nextInt(field.length),new Random().nextInt(field[0].length));
        if (!animalPosition.isCoast()) {

            Animal animal = new Predator(island, animalPosition) {
                @Override
                void eat() {

                }

                @Override
                void reproduction() {

                }
            };
            break;
        } else System.out.println("Попытка создания жизни на пляже. Ошибка!");
    }
    }
}
