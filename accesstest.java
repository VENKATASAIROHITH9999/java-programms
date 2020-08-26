class Test
{
   int a;//defaukt access
   public int b;//public access
   private int c;//private access 
   void setc(int i)
   {
      c=i;//set value of c
   }
   int getc()
   {
      return c;
   }
}
class accesstest
{
   public static void main(String args[])
   {
   Test obj=new Test();//creating object for class Test
   obj.a=100;
   obj.b=200;
   //obj.c=300 it cant be accessed as it is private thing
   obj.setc(100);
   System.out.println("a,b,c="+obj.a+"\n"+obj.b+"\n"+obj.getc());
   } 
}