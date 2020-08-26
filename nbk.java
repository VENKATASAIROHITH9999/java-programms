interface balayya
{
    void eat();
}
interface balayyalegend
{
   void travel();
}
class balakrishna implements balayyalegend
{
   public void eat()
   {
      System.out.println("jai balayya");
   }
   public void travel()
   {
       System.out.println("co co cola pepsi balayya babu sexy");
   }
}
class nbk
{
   public static void main(String args[])
   {
       balakrishna ntr=new balakrishna();
       ntr.eat();
       ntr.travel();
   }
}