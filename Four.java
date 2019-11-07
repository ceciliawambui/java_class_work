import java.util.Scanner;
class Four
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      double base_length, height, area;

      System.out.print("\nEnter the base_length of the right_angled triangle:");
      base_length = s.nextDouble();
      System.out.print("Enter the height of the right right_angled triangle: ");
      height = s.nextDouble();
      area = 0.5 * base_length * height;
      System.out.println("The area of the right_angled triangle is: " + area);
      
   }
}