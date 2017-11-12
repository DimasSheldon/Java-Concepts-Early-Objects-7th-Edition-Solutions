package EKPL.Chapter4_FundamentalDataType;

/**
 * Created by Sheldon on 11/3/2016.
 */
public class R4_6 {
  public static void main(String[] args) {
    double x = 2.5;
    double y = -1.5;
    int m = 18;
    int n = 4;
    String s = "Hello";
    String t = "World";

    double a = x + n * y - (x+n)  * y;
    System.out.println(a);
    double e = Math.sqrt(Math.sqrt(n));
    System.out.println(e);
    String what = s.substring(s.length()/2, s.length());
    System.out.println(what);
  }
}
