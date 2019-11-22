import java.util.Scanner;
class Eight1
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);
        int speed, speed_limit, excess_speed, fine;

	System.out.print("Enter the speed limit:");
        speed_limit = input.nextInt();
	System.out.print("Enter vehicle's speed:");
        speed = input.nextInt();
	excess_speed = speed - speed_limit;

        if(speed > speed_limit && excess_speed < 30)
	{
            System.out.print("Fine = Ksh.2,500");
	    System.out.print("\nExcess_speed:" + excess_speed);
            
	}
        else 
	{
           System.out.print("Fine = Ksh.4,000");
	   System.out.print("\nExcess_speed:" + excess_speed);
	}
    }
}