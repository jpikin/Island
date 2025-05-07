import java.util.Random;

public class Cell {
    private int[] position;
    private boolean coast;
    private boolean isPlant = false;
    private int plantCount = 0;


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
    private boolean isCoast(){
        return coast;
    }
    //Для теста, удалить:
    public String toString(){
        return "Ячейка" + position[0] + " " + position[1] + " Берег: " + coast + " Растительность: " + plantCount;
    }
    public int[] getPosition() {
        return position;
    }
}
