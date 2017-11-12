package EKPL.Chapter3_ImplementingClasses.TallyCounter;

/**
 * Created by Sheldon on 10/13/2016.
 * This class models a tally counter.
 * E3.1, E3.2
 */
public class Counter {
    private int value;

    /**
     * Gets the current value of this counter.
     *
     * @return the current value
     */
    public int getValue() {

        return value;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void click() {
        int max = 100;

        //value = value + 1;
        value = Math.min((value += 1), max);
    }

    /**
     * Resets the value of this counter to 0.
     */
    public void reset() {

        value = 0;
    }

    /**
     * Undoes an unwanted button click.
     */
    public void undoClick() {
        int min = 0;

        //value = value - 1;
        value = Math.max((value -= 1), min);

    }

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        for (int i = 0; i < 100; i++) {
            myCounter.click();
        }
        for (int j = 0; j < 10; j++) {
            myCounter.undoClick();
        }
        System.out.println(myCounter.getValue());
    }
}