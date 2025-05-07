import java.util.Random;

public abstract class Animal {
    private final Island island;
    private Cell position;
    private final int speed = 2;  //Для теста. Перенести в конструктор.
    private final int mass = 8;
    private int hunger;

    public Animal(Island island, Cell position){
        this.island = island;
        this.position = position;
        position.addAnimal(this);
        System.out.println("Animal created " + "в " + position);
        move();

    }


    private void move() {
        Cell[][] field = island.getField();
        int[] coordinates = position.getPosition();
        int xCoordinate = coordinates[0];
        int yCoordinate = coordinates[1];
        position.removeAnimal(this);
        while (true) {
            int takeACourse = new Random().nextInt(4);
            switch (takeACourse) {
                case 0:
                    if (xCoordinate + speed <= field[0].length - 2) {
                        setNewPosition(xCoordinate + speed, coordinates[1]);
                        position.addAnimal(this);
                        System.out.println("Animal moved " + position);
                        return;
                    } else break;
                case 1:
                    if (yCoordinate + speed <= field[1].length - 2) {
                        setNewPosition(coordinates[0], yCoordinate+speed);
                        position.addAnimal(this);
                        System.out.println("Animal moved " + position);
                        return;
                    } else break;
                case 2:
                    if (xCoordinate - speed >= 2) {
                        setNewPosition(xCoordinate - speed, coordinates[1]);
                        position.addAnimal(this);
                        System.out.println("Animal moved " + position);
                        return;
                    } else break;
                case 3:
                    if (yCoordinate - speed >= 2) {
                        setNewPosition(coordinates[0], yCoordinate-speed);
                        position.addAnimal(this);
                        System.out.println("Animal moved " + position);
                        return;
                    } else break;
                default:
                    break;
            }
        }

    }
    abstract void eat();

    abstract void reproduction();

    public boolean isHungred() {
        return hunger <= 2;
    }
    private void setNewPosition(int xCoordinate, int yCoordinate) {
        this.position = island.getField()[xCoordinate][yCoordinate];
    }


}
