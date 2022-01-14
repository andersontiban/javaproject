public class MoneyConverter
{
   private double total = 0;
   private double money;
   //constructor
   public MoneyConverter(double currency)
   {
      money = currency;
   }
   
   //euro converter
   public String getEuro()
   {
      total = money * 0.88;
      return String.format("%.2f", total);
   }
  
   //canda converter
   public String getCanada()
   {
      total = money * 1.26;
      return String.format("%.2f", total);
   }
   //peso converter
   public String getPeso()
   {
      total = money *20.35;
      return String.format("%.2f", total);
   }
   
   //display amount
   public double getMoney()
   {
      return money;  
   }





}