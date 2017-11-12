package EKPL.Chapter4_FundamentalDataType.TicTacToeGrid;

/**
 * Created by Sheldon on 11/1/2016.
 * E4.14
 * A program that builds the tic-tac-toe grid
 */
public class TicTacToeGrid {
  public static void main(String[] args) {
    //Construct the patterns
    final String COMB_SHAPE = "+--+--+--+\r\n|  |  |  |";
    final String BOTTOM_LINE = "+--+--+--+";

    //Print the combined patterns
    System.out.println(COMB_SHAPE);
    System.out.println(COMB_SHAPE);
    System.out.println(COMB_SHAPE);
    System.out.println(BOTTOM_LINE);
  }
}