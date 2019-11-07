import java.util.Scanner;
class Three
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      double width, length, area , perimeter;

      System.out.print("\nEnter the width of the rectangle:");
      width = s.nextDouble();
      System.out.print("Enter the length of the rectangle: ");
      length = s.nextDouble();
      area = width * length;
      System.out.println("The area of the rectangle is: " + area);
      perimeter = 2 * (length + width);
      System.out.println( "The perimeter of the rectangle is:"+ perimeter);
   }
}