public abstract class Herbivore extends Animal{
    private boolean isCatched = false;

    public Herbivore(Island island, Cell position) {
        super(island, position);
    }

    public boolean getCatched() {
        return isCatched;
    }
    public void setCatched() {
        isCatched = true;
    }
}
