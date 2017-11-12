//package EKPL.Chapter8_DesigningClasses.E8_17;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
///**
// * Created by Sheldon on 11/29/2016.
// * A JUnit test program for Student class
// * E8.17
// */
//public class StudentTest {
//  @Test
//  public void testAddScores() {
//    Student sheldon = new Student(5);
//    sheldon.addScore(8.0);
//    sheldon.addScore(8.0);
//    sheldon.addScore(9.0);
//    sheldon.addScore(7.5);
//    sheldon.addScore(7.0);
//
//    ArrayList<Double> scores = new ArrayList<>();
//    scores.add(8.0);
//    scores.add(8.0);
//    scores.add(9.0);
//    scores.add(7.5);
//    scores.add(7.0);
//    Assert.assertArrayEquals(scores.toArray(), sheldon.getScores().toArray());
//  }
//
//  @Test
//  public void testFinalScore() {
//    Student sheldon = new Student(5);
//    sheldon.addScore(8.0);
//    sheldon.addScore(8.0);
//    sheldon.addScore(9.0);
//    sheldon.addScore(7.5);
//    sheldon.addScore(7.0);
//    double DELTA = 1E-14;
//    Assert.assertEquals(32.5, sheldon.finalScore(), DELTA);
//  }
//
//  @Test
//  public void testMinimum() {
//    Student sheldon = new Student(5);
//    sheldon.addScore(8.0);
//    sheldon.addScore(8.0);
//    sheldon.addScore(9.0);
//    sheldon.addScore(7.5);
//    sheldon.addScore(7.0);
//    double DELTA = 1E-14;
//    Assert.assertEquals(7.0, sheldon.getMin(), DELTA);
//  }
//}
