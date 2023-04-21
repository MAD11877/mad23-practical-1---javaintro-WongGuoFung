import java.util.Arrays;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numOfLoop = in.nextInt();
    int i = 0;
    int[] numberArray = {}; 

    while (i < numOfLoop)
    {
      numberArray = Arrays.copyOf(numberArray, numberArray.length + 1);
      int number = in.nextInt();
      numberArray[numberArray.length - 1] = number;
      i++;
    }
    int maxValue = 0, maxCount = 0;
    for (int a = 0; a < numberArray.length; ++a) 
    {
      int count = 0;
      for (int j = 0; j < numberArray.length; ++j) 
      {
          if (numberArray[j] == numberArray[a])
              ++count;
      }
      if (count > maxCount) 
      {
          maxCount = count;
          maxValue = numberArray[a];
      }
      in.close();
    }
    // Run through all number
    System.out.print(maxValue);
  }
}
