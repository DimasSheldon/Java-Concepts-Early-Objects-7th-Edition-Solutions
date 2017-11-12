package EKPL.Chapter4_FundamentalDataType.LargeLetters;

/**
 * Created by Sheldon on 11/1/2016.
 * E4.17
 * A program that prints a string horizontally or vertically
 */
public class LargeName {
  public static void main(String[] args) {
    //Constuct the letters
    final String LETTER_D = "****\n" +
            "*    *\n" +
            "*     *\n" +
            "*     *\n" +
            "*     *\n" +
            "*    *\n" +
            "****\n";
    final String LETTER_I = "*******\n" +
            "   *\n" +
            "   *\n" +
            "   *\n" +
            "   *\n" +
            "   *\n" +
            "*******\n";
    final String LETTER_M = "****     ****\n" +
            "*   *   *   *\n" +
            "*    * *    *\n" +
            "*     *     *\n" +
            "*           *\n" +
            "*           *\n" +
            "*           *\n";
    final String LETTER_A = "      **\n" +
            "     *  *\n" +
            "    *    *\n" +
            "   ********\n" +
            "  *        *\n" +
            " *          *\n" +
            "*            *\n";

    final String LETTER_S = "  ***********\n" +
            " *\n" +
            "*\n" +
            "  ***********\n" +
            "             *\n" +
            "           *\n" +
            "***********";
    //Print a string vertically
    System.out.println(LETTER_D);
    System.out.println(LETTER_I);
    System.out.println(LETTER_M);
    System.out.println(LETTER_A);
    System.out.println(LETTER_S);

    //Print a string horizontally
    System.out.println("****    *******  ****     ****        **           ***********\n" +
            "*    *     *     *   *   *   *       *  *         *\n" +
            "*     *    *     *    * *    *      *    *       *\n" +
            "*     *    *     *     *     *     ********        ***********\n" +
            "*     *    *     *           *    *        *                  *\n" +
            "*    *     *     *           *   *          *               *\n" +
            "****    *******  *           *  *            *  ***********");
  }
}
