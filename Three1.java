import java.util.Scanner;
class Three1
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);
        int num;
	double Gross_Pay;
	double Net_Pay;
	double Tax;

        System.out.println("\tGross Pay\t\t\tTax Rate\n\t1)Over 40,000\t\t\t30%\n\t2)>=30,000 but below 40,000\t25%\n\t3)>=20,000 but below 30,000\t15%\n\t4)>=10,000 but below 20,000\t10%\n\t5)Below 10,000\t\t\t no tax.");
        

        System.out.print("Enter num:");
        num = input.nextInt();

        if(num == 1)
	{
            System.out.print("Enter Gross Pay:");
            Gross_Pay = input.nextDouble();
	    Tax = 0.3 * Gross_Pay;
	    System.out.println("Tax = " + Tax); 
            Net_Pay = Gross_Pay - Tax;
            System.out.println("Net Pay = " + Net_Pay); 
	}
        else if(num == 2)
	{
            System.out.print("Enter Gross Pay:");
            Gross_Pay = input.nextDouble();
	    Tax = 0.25 * Gross_Pay;
	    System.out.println("Tax = " + Tax); 
            Net_Pay = Gross_Pay - Tax;
            System.out.println("Net Pay = " + Net_Pay);
	}
        
        else if(num == 3)
	{
            System.out.print("Enter Gross Pay:");
            Gross_Pay = input.nextDouble();
	    Tax = 0.15 * Gross_Pay;
	    System.out.println("Tax = " + Tax); 
            Net_Pay = Gross_Pay - Tax;
            System.out.println("Net Pay = " + Net_Pay);
	}
        else if(num == 4)
	{
	    System.out.print("Enter Gross Pay:");
            Gross_Pay = input.nextDouble();
	    Tax = 0.1 * Gross_Pay;
	    System.out.println("Tax = " + Tax); 
            Net_Pay = Gross_Pay - Tax;
            System.out.println("Net Pay = " + Net_Pay);
        }
	else if(num == 5)
	{
            System.out.print("Enter Gross Pay:");
            Gross_Pay = input.nextDouble();
	    Tax = 0.0 * Gross_Pay;
	    System.out.println("Tax = " + Tax); 
            Net_Pay = Gross_Pay - Tax;
            System.out.println("Net Pay = " + Net_Pay);
        }
	else
	{
	    System.out.println("Invalid num!!");
	}

    }
}