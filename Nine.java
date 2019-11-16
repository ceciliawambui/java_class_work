import java.util.Scanner;
class Nine
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the weight in grams:");
        double grams = input.nextDouble();
        double kilograms = grams / 1000;
        double times = 1000 / grams;
        System.out.println("The weight of the package is" + kilograms + ".");
        System.out.println("It takes" + times + "such packages to form one kilogram.");


    }
}