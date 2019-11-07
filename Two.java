import java.util.Scanner;
class Two
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      double radius, area, circumference;

      System.out.print("Enter the radius: ");
      radius = s.nextDouble();
      area = Math.PI * (radius * radius);
      System.out.println("The area of the circle is: " + area);
      circumference= Math.PI * 2 *radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}