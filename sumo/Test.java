class Test
{
   int a;//defaukt access
   public int b;//public access
   private int c;//private access 
   void setc()
   {
      c=i;'//set value of c
   }
   void getc
   {
      return i;
   }
 }
class accesstest
{
   Test obj=new Test();//creating object for class Test
   obj.a=100;
   obj.b=200;
   obj.c=300;
   System.out.println("a,b,c="+obj.a+""+obj.b+""+obj.c);
}  