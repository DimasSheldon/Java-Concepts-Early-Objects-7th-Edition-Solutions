package EKPL.Chapter6_Loops.Exercise.Die;

import java.util.Random;

/**
 * Created by Sheldon on 11/8/2016.
 * This class models a die that, when cast, lands on a
 * random face.
 */
public class Die {
  private int _sides;
  private Random generator;

  /**
   * Constructs a die with a given number of sides
   *
   * @param sides the number of sides, e.g., 6 for a normal die
   */
  public Die(int sides) {
    _sides = sides;
    generator = new Random();
  }

  /**
   * Simulaltes a throw of a die
   *
   * @return the face of the die
   */
  public int cast() {
    return 1 + generator.nextInt(_sides);
  }
}