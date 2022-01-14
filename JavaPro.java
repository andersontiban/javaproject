import java.util.Scanner;
public class JavaPro
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      double value;
      int input = 1;
      //get input to convert amount  
      System.out.print("Enter amount to convert: $");
      value = keyboard.nextDouble();
      
      MoneyConverter user = new MoneyConverter(value);
      //display money.
      do
      {
         Menu();
         System.out.print("\nEnter a number choice: ");
         input = keyboard.nextInt();
         
         //controlls which object method fires
         switch(input)
         {
            case 1:
               System.out.println("\nEuro Conversion: €" + user.getEuro());
               break;
            
            case 2:
               System.out.println("\nCanadian dollar Conversion: $" + user.getCanada());
               break;
            case 3:
               System.out.println("\nPeso Conversion: $" + user.getPeso());
               break;

         }
      
      
      } while (input == 1 || input ==2 || input ==3);

      
      
      
   }
   //display menu options
   public static void Menu()
   {
      System.out.print("\n1.Euro Conversion\n2.Canadian Dollar Conversion\n3.Mexican Peso Conversion\n");
   }
}