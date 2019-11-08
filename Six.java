import java.util.Scanner;
class Six
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Input temperature in degree Celsius: ");
        double Celsius = input.nextDouble();
        double Fahrenheit = (1.8 * Celsius) +  32;
        System.out.println(Celsius + "C" + "=" + Fahrenheit + "F");

    }
}