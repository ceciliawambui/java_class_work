import java.util.Scanner;
public class Five
{

    public static void main(String[] Strings) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for cm: ");
        double cm = input.nextDouble();
        double meters = cm * 0.01;
        System.out.println(cm + "cm" + "=" + meters + " meters");

    }
}