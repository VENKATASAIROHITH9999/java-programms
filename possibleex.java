/*possibitily of programm to continue*/
class possibleex
{
   public static void main(String args[])/*main method*/
   {
     int numer[]={1,2,3,4,78};
     int dinom[]={2,3,45,5,67};
     for(int i=0;i<numer.length;i++)
     {
       try/*exception is present here*/
       {
          System.out.println(numer[i]/dinom[i]);
       }
       catch(ArithmeticException e)/*catches the exception in try block*/
       {
          System.out.println("divided by zero");
       }
       System.out.println("after catch");
     }
   }
}
/*statement after catch is next iteration of a for loop*/
