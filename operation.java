interface artha
{
   void sum();
   void sub();
}
interface arthametic
{
    void div();
     void mult(); 
}
class asd implements artha,arthametic
{
   int a,b;
   asd(int x,int y)
   {
      a=x;
      b=y;
   }  
   public void sum()
   {
      System.out.println("sum="+(a+b));
   }
   public void sub()
   {
      System.out.println("sub="+(a-b));
   }
   public void mult()
   {
       System.out.println("mult="+(a*b));
   }
   public void div()
   {
       System.out.println("div="+(a*b));
   }
}
class operation
{
   public static void main(String args[])
   {
       asd obj1=new asd(1,2);
       obj1.sum();
       obj1.sub();
       obj1.div();
       obj1.mult();
   }
}