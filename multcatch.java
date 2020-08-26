/*multiple catch clause*/
/*a try block may contain more than one type of exception to overcome this multiple catch clauses are used*/
class multcatch
{
   public static void main(String args[])/*main method*/
   {
     int numer[]={1,2,3,4,78,1234};
     int dinom[]={2,3,45,5,67};
     for(int i=0;i<numer.length;i++)
     {
       try/*exception is present here*/
       {
          System.out.println(numer[i]/dinom[i]);
       }
       catch(ArithmeticException e)/*catches the arithmetic exception in try block*/
       {
          System.out.println("divided by zero");
       }
       catch(ArrayIndexOutOfBoundsException e)/*catchs the index out of bounds exception*/
       {
       System.out.println("no matching found element");
       }
       System.out.println("after catch");
     }
   }
}
/*exception object specified as a parameter(e)is discription of index*/
