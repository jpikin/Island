public abstract class Herbivore extends Animal{
    private boolean isCatched = false;
    
    public boolean getCatched() {
        return isCatched;
    }
    public void setCatched() {
        isCatched = true;
    }
}
