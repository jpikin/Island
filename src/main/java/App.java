import java.util.Random;

public class App {

    public static void main(String[] args) throws InterruptedException {
    Island island = new Island();
    createALife(island);
    Thread.sleep(5000);
    turn(island);
    }

    private static void turn(Island island) {

    }


    //Изменить реализацию. Сделана для теста.
    private static void createALife(Island island) {
        Cell[][] field = island.getField();

        createAnAnimal(island, field);
        createAnAnimal(island, field);
        createAnAnimal(island, field);
        }


    private static void createAnAnimal(Island island, Cell[][] field) {
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
