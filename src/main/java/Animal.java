public abstract class Animal {
    private Cell position;
    private int speed;

    abstract void move();
    abstract void eat();
    abstract Cell getPosition();
    abstract void reproduction();
}
