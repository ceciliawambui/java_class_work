import java.util.Scanner;
class Six1
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a:");
	System.out.print("Enter b:");
        a = input.nextInt();
	b = input.nextInt();
	if (a > b)
	{
           System.out.print(a / b); 
	}
        else if(b > a)
	{
           System.out.print(b / a);
	}
        
	else if (b == 0)
	{
	    System.out.print("ERROR");
	}

        else
	{
	    System.out.print("ERROR");
	}

    }
}