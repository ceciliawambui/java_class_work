import java.util.Scanner;

class One
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double i, j, k, sum, product, average;

      System.out.println("\nEnter three numbers: ");
      i = myScanner.nextDouble();
      j = myScanner.nextDouble();
      k = myScanner.nextDouble();

      sum = i + j + k;
      product = i * j * k;
      average = sum / 3;

      System.out.println("\nThe sum of the numbers is " + sum);
      System.out.println("The product of the numbers is " + product);
      System.out.println("Their average of the numbers is " + average);
   }
}
