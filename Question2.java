import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in = new Scanner(System.in);
    
    System.out.print("Input height in meters: ");
    double height = in.nextDouble();

    System.out.print("Input Weight in kilogram: ");
    double weight = in.nextDouble();
    in.close();

    double BMI = weight / (height * height);
    System.out.printf("The Body Mass Index (BMI) is " + "%.1f" + " kg/m2", BMI);
  }
}
