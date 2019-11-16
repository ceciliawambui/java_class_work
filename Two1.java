import java.util.Scanner;

class One2
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int choice, i, product;

      System.out.println("\n\t **** Jamal and daugthers Pub ***\n");
      System.out.println("\tBeer Brand\tPrice\n\t1)Tusker\t100/=\n\t2)Pilsner\t120/=\n\t3)Smirnoff Ice\t140/=\n\t4)White Cap\t90/=");
        
      System.out.print("\nEnter your choice:");
      choice = input.nextInt();

      switch(choice)
      {
      case 1: System.out.println("\nHow many of Tusker do you want?");
              i = input.nextInt();
              product = i * 100;
              System.out.println(i + " bottles of Tusker will cost you Kshs." + product); 
              break;
      case 2:System.out.println("\nHow many of Pilsner do you want?");
              i = input.nextInt();
              product = i * 120;
              System.out.println(i + " bottles of Pilsner will cost you Kshs." + product);
              break;
      case 3: System.out.println("\nHow many of Smirnoff Ice do you want?");
              i = input.nextInt();
              product = i * 140;
              System.out.println(i + " bottles of Smirnoff Ice will cost you Kshs." + product);
              break;
      case 4: System.out.println("\nHow many of White Cap do you want?");
              i = input.nextInt();
              product = i * 90;
              System.out.println(i + " bottles of White Cap will cost you Kshs." + product);
              break;
      default: System.out.println("\nThe choice you entered is  invalid.");
               break;
      }
    }
}