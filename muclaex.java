/*exception handling in multiple classes*/
class gen
{
   static void genexe()/*static method:can be accesed by main method without creating any object*/
   {
      int a[]=new int[5];/*initialization*/
      try  /*exception occures in this try block*/
      {
        System.out.println("before exceptiion");
        a[5]=20;
        System.out.println("this will not be displayed");
      }
      catch(ArrayIndexOutOfBoundsException e)/*catches the exception in try block*/
      {
         System.out.println("index out of bounds in method");
      }
   }
}
class muclaex  /*new class with main method*/
{
   public static void main(String args[])/*main method*/
   {
      gen.genexe();/*calling genexe() method*/
      System.out.println("in main after exception");
   }
}
