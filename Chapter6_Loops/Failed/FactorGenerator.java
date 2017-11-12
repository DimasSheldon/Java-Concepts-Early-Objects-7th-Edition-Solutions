package EKPL.Chapter6_Loops.Failed;

/**
 * Created by Sheldon on 11/15/2016.
 * P6.3
 */
public class FactorGenerator {
  private int _numberToFactor;
  private final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

  public FactorGenerator(int numberToFactor) {
    _numberToFactor = numberToFactor;
  }

  public void factorize() {
    boolean done = false;
    int i = 0;
    int factor;
    while (!done && i < PRIMES.length) {
      if (_numberToFactor % PRIMES[i] == 0) {
        factor = PRIMES[i];
        System.out.print(factor + " ");

        _numberToFactor = _numberToFactor / PRIMES[i];
        if (_numberToFactor == 1) {
          done = true;
        }
      } else {
        i++;
      }
    }
  }
}