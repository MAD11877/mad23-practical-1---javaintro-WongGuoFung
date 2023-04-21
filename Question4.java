import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int pattern = in.nextInt();
    for (int i = 1; i <= pattern; i++)
    {
      for (int s = 0; s <= pattern - i; s++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    in.close();
  }
}
