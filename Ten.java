import java.util.Scanner;
class Ten
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter the age of the person:");
        age = input.nextInt();
        if (age >=18)
        System.out.println("You can vote.");
        else
        System.out.println("You are too young to vote.");


    }
}