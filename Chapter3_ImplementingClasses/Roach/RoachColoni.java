package EKPL.Chapter3_ImplementingClasses.Roach;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class RoachColoni {
    private int population;

    /**
     *
     * @param initialPopulation
     */
    public RoachColoni(int initialPopulation){
        population = initialPopulation;

    }

    /**
     *
     */
    public void breed(){
        population = population*2;
    }

    /**
     *
     * @param percentage
     */
    public void spray(double percentage){
        population = (int) (population - (population*percentage/100));
    }

    /**
     *
     * @return
     */
    public int getRoaches(){
        return population;
    }
}
