import java.util.Random;

public class Cell {

    private boolean coast;
    private boolean isPlant = false;
    private int plantCount = 0;


    public Cell(int x, int y, boolean coast) {
        int[] position = new int[]{x, y};
        plantCount = setPlants();
        getIsPlant();
        this.coast = coast;

    }

    public void getIsPlant() {
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
}
