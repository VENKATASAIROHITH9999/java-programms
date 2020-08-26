/*nested try block*/
class nestedtry
{
   public static void main(String args[])/*main method*/
   {
      int num[]={1,2,3,4,5,6,7};
      int den[]={2,0,9,7};
      try/*outer try block*/
      {
       for(int i=0;i<num.length;i++)
       {
        try/*inner try block*/
        {
          System.out.println(num[i]/den[i]);
        }
        catch(ArithmeticException e)/*inner catch block*/
        {
        System.out.println("division by zero");
        }
       }
      }
      catch(ArrayIndexOutOfBoundsException e)/*outer catch block*/
      {
         System.out.println("array outof bounds");
      }
      System.out.println("after catch");
   }
}
