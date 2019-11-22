import java.util.Scanner;
class Five1
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter a:");

        a = input.nextInt();
	if (a > 0)
	{
           System.out.print("POSITIVE"); 
	}
        else if(a < 0)
	{
           System.out.print("NEGATIVE");
	}
        
	else
	{
	    System.out.print("ZERO");
	}

        

    }
}