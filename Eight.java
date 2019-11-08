import java.util.Scanner;
class Eight
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the distance in kilometres:");
        double kilometres = input.nextDouble();
        double metres = kilometres * 1000;
        System.out.println(kilometres + "kilometres =" + metres + "metres");

    }
}