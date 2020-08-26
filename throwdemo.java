/*throw:throws an exception manually without interfearence of JVM*/
/*throwsan object and we have have to create it manually*/
class throwdemo
{
  public static void main (String args[])/*main method*/
  {
    try /*it contains exception*/
    {
       System.out.println("before exeption");
       throw new ArithmeticException();/*manual throwing of ArithmeticException*/
    }
    catch(ArithmeticException e)/*catches exception from try block*/
    {
      System.out.println("ArithmeticException caught");
    }
    System.out.println("after catch");
  }
}
