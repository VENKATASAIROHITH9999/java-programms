abstract class1
{
  abstract void met();
}
abstract bodyclass extends class1
{
   void method()
   {
     System.out.println("this is body bodyclass");
   }
}
class abstractmainc
{
   public static void main(String args[])
   {
     bpdyclass obj=new bodyclass();
     obj.method();
   }
}
