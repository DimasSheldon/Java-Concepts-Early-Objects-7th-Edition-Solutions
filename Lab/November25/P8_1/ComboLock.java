package EKPL.Lab.November25.P8_1;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/25/2016.
 */
public class ComboLock {
  private final int N_COMBINATION = 3;
  private ArrayList<Integer> secretKeys;

  private ArrayList<Integer> combinations;

  private int key = 0;

  private boolean[] open = new boolean[N_COMBINATION];

  //right, left, right
  public ComboLock(int secret1, int secret2, int secret3) {
    secretKeys = new ArrayList<>();
    secretKeys.add(secret1);
    secretKeys.add(secret2);
    secretKeys.add(secret3);
    combinations = new ArrayList<>();
  }

  public void reset() {
    combinations.removeAll(null);
  }

  public void turnLeft(int ticks) {
    key = key - ticks;
    combinations.add(key);
  }

  public void turnRight(int ticks) {
    key = key + ticks;
    combinations.add(key);
  }

  public boolean open() {
    if (combinations.size() > N_COMBINATION) {
      return false;
    } else {
        if (combinations.equals(secretKeys)) {
          return true;
        } else {
          return false;
      }
    }
  }
}