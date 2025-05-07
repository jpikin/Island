import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cell {
    private int[] position;
    private boolean coast;
    private boolean isPlant = false;
    private int plantCount = 0;
    private final List<Animal> animals = new ArrayList<>();

    public Cell(int x, int y, boolean coast) {
        position = new int[]{x, y};
        this.coast = coast;
        plantCount = setPlants();
        getPlant();
    }

    public void getPlant() {
        isPlant = getPlantCount() != 0;
        }

    private int setPlants(){
        if(!isCoast()) return new Random().nextInt(11);
        else return 0;


    }
    public int getPlantCount(){
        return plantCount;
    }
    public void setPlantCount(int plantCount){
        this.plantCount = plantCount;
    }
    public boolean isCoast(){
        return coast;
    }
    //Для теста, удалить:
    public String toString(){
        return "Ячейка  " + position[0] + " " + position[1] + " Берег: " + coast + " Растительность: " + plantCount + " Население: " + isPopulated();
    }
    public int[] getPosition() {
        return position;
    }
    public void setPosition(int[] position) {
        this.position = position;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
    public boolean isPopulated() {
        return !animals.isEmpty();
    }

}
