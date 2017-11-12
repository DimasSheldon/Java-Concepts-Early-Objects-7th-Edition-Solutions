//package EKPL.Chapter5_Decisions.Tax;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Scanner;
//
///**
// * Created by Sheldon on 11/28/2016.
// */
//public class TaxCalculator {
//  @Test
//  public void testSingle() {
//    int status = 1;
//    double income = 30000;
//    TaxReturn theTax = new TaxReturn(income, status);
//    double expected = 3000;
//    final double EPSILON = 1E-14;
//    Assert.assertEquals(expected, theTax.getTax(), EPSILON);
//  }
//
//  @Test
//  public void testMarried() {
//    int status = 2;
//    double income = 60000;
//    TaxReturn theTax = new TaxReturn(income, status);
//    double expected = 6000;
//    final double EPSILON = 1E-14;
//    Assert.assertEquals(expected, theTax.getTax(), EPSILON);
//  }
//
//  @Test
//  public void testWealthSingle() {
//    int status = 1;
//    double income = 64000;
//    TaxReturn theTax = new TaxReturn(income, status);
//    double expected = 11200; // 3200 + 8000
//    final double EPSILON = 1E-14;
//    Assert.assertEquals(expected, theTax.getTax(), EPSILON);
//  }
//
//  @Test
//  public void testWealthMarried() {
//    int status = 2;
//    double income = 128000;
//    TaxReturn theTax = new TaxReturn(income, status);
//    double expected = 22400; // 6400 + 16000
//    final double EPSILON = 1E-14;
//    Assert.assertEquals(expected, theTax.getTax(), EPSILON);
//  }
//
//  public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//
//    System.out.print("Please enter your income: ");
//    double income = input.nextDouble();
//
//    System.out.print("Are you married? (Y/N) ");
//    String confirm = input.next();
//
//    int status;
//    if (confirm.equals("Y") || confirm.equals("y")) {
//      status = TaxReturn.MARRIED;
//    } else {
//      status = TaxReturn.SINGLE;
//    }
//
//    TaxReturn aTaxReturn = new TaxReturn(income, status);
//
//    System.out.println("Tax: " + aTaxReturn.getTax());
//  }
//}