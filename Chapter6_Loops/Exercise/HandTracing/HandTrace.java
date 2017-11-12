package EKPL.Chapter6_Loops.Exercise.HandTracing;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/6/2016.
 */
public class HandTrace {
  public static void main(String[] args) {
    // 6
//    int n = 5;
//    while (n >= 0) { // 5 4 3 2 1 0
//      n--; // 4 3 2 1 0 -1
//      System.out.println(n); // 4 3 2 1 0 -1
//    }

    // 7
//    int n = 1;
//    while (n <= 3) { //1 2 3
//      System.out.print(n + ", "); // 1, 2, 3,
//      n++; // 2 3 4
//    }

    // 8
//    int a = 2;
//    int n = 4;
//    int r = 1;
//    int i = 1;
//    while (i <= n) { //i <= 4 // 1 2 3 4
//      r = r * a; // 2 4 8 16
//      i++; // 2 3 4 5
//    }

    // 9 don't run this
//    int n = 1;
//    while (n != 50) { //1 11 21...
//      System.out.println(n); //1 11 21...
//      n = n + 10;//11 21 31...
//      //Infinite loops
//    }
    // 10
//    int count = 1;
//    double temp = 123.0; // 100
//    while (temp > 10) { //123 12.3 // 100
//      count++; //2 3 //2
//      temp = temp / 10.0; //12.3 1.23 //10
//    }
//    System.out.println(count);

    // 12
//    for (int n = 10; n >= 0; n--) { // 10
//      System.out.println(n); // 10
//    }

    // 13
//    for (int i = 10; i <= 20; i += 2) {
//      System.out.println(i);
//    }
    // 14
//    int n = 10000;
//    int sum = 0;
//    for (int i = 1; i <= n; i++) {
//      sum = sum + i;
//    }
//    System.out.println(sum);
    Scanner in = new Scanner(System.in);
    int value;
    do {
      System.out.print("Enter an integer between 0-100(inclusive): ");
      value = in.nextInt();
    }while (value < 0 || value > 100);
  }
}