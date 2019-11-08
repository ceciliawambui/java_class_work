import java.util.Scanner;
class Seven
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the distance in metres:");
        double metres = input.nextDouble();
        double kilometres = metres / 1000;
        System.out.print("Input the time taken in minutes: ");
        double minutes= input.nextDouble();
        double speed = kilometres / minutes;
        System.out.println("The speed is" + speed + "km/h" );

    }
}