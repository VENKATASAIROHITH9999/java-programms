class overloaded
{
   void met()
   {
      System.out.println("no parameters");
   }
   void met(int a)
   {
     System.out.println("value of a="+a);
   }
   void met(int a,double c)
   {
     System.out.println("value of integer="+a+"\n"+"value of double="+c);
   }
}
class overloadmain
{
   public static void main(String args[])
   {
      overloaded ob=new overloaded();
      ob.met();
      ob.met(12);
      ob.met(23,12.24);
   }
}
