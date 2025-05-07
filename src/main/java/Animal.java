import java.util.Random;

public abstract class Animal {
    private Island island;
    private Cell position;
    private int speed;
    private int mass;
    private int hunger;

    private void move() {
        Cell[][] field = island.getField();
        int[] coordinates = position.getPosition();
        int xCoordinate = coordinates[0];
        int yCoordinate = coordinates[1];
        while (true) {
            int takeACourse = new Random().nextInt(4);
            switch (takeACourse) {
                case 0:
                    if (xCoordinate + speed <= field[0].length - 2) {
                        position = field[xCoordinate + speed][coordinates[1]];
                        return;
                    } else break;
                case 1:
                    if (yCoordinate + speed <= field[1].length - 2) {
                        position = field[coordinates[0]][yCoordinate + speed];
                        return;
                    } else break;
                case 2:
                    if (xCoordinate - speed >= 2) {
                        position = field[xCoordinate - speed][coordinates[1]];
                        return;
                    } else break;
                case 3:
                    if (yCoordinate - speed >= 2) {
                        position = field[coordinates[0]][yCoordinate - speed];
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


}
