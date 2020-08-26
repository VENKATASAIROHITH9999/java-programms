/*exception handling by caller of the method*/
class gen
{
   static void genexe()/*static method*/
   {
      int a[]=new int[5];
      System.out.println("before exception");
      a[5]=20;
      System.out.println("this will not be displayed");
   }
}
class callerex/*main class*/
{
  public static void main(String args[])/*main method*/
  {
   try  /*even though exeption is present gen class and genexe() method its caller can access the exceptin*/
   {
      gen.genexe();/*caller of genexe()*/
   }
   catch(ArrayIndexOutOfBoundsException e)/*catches the exception in try block*/
   {
     System.out.println("index out of bounds exception");
   }
   System.out.println("after catch");
 }
}
