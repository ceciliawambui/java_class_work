import java.util.Scanner;
class Seven1
{
	
    public static void main(String[] Strings)
    {

        Scanner input = new Scanner(System.in);
        int figure;
	double radius, length, width, area, circumference, height, perimeter, base_length;

       
        System.out.println("\t1)Circle\n\t2)Rectangle\n\t3)Right-angled_Triangle");
        

        System.out.print("Enter your figure:");
        figure = input.nextInt();

        if(figure == 1)
	{
            System.out.print("Enter the radius:");
            radius = input.nextDouble();
            area = 3.142 * radius * radius;
	    circumference = 3.142 * 2 *(radius + radius);
            System.out.println("Area =" + area);
	    System.out.println("Circumference =" + circumference);
	}
        else if(figure == 2)
	{
            System.out.print("Enter the length:");
            length = input.nextDouble();
	    System.out.print("Enter the width:");
            width = input.nextDouble();
            area = length * width;
            perimeter = 2 * (length + width);
            System.out.println("Area =" + area);
	    System.out.println("Perimeter =" + perimeter);
	}
        
        else if(figure == 3)
	{
            System.out.print("Enter the height:");
            height = input.nextDouble();
	    System.out.print("Enter the base_length:");
            base_length = input.nextDouble();
            area = 0.5 * base_length * height;
            System.out.println("Area =" + area);
	}
        
	else
	{
	    System.out.println("Invalid figure!!");
	}

    }
}