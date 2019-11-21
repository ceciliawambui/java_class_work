import java.util.Scanner;
class Four1
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter a:");
	System.out.print("Enter b:");
	
        a = input.nextInt();
	b = input.nextInt();

	if(a > b)
	{
           System.out.print(a - b); 
	}
        else if(b > a)
	{
           System.out.print(b / a);
	}
        
	else
	{
	    System.out.print(a + b);
	}

        

    }
}