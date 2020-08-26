/*an exception catch can be rethrown so that outer catch can handle and multiple handlers access the exception*/
class rethrown
{
  public static void genexe()
  {
     int num[]={15,21,32,434,55};
     int den[]={23,45,0,0};
     for(int i=0;i<num.length;i++)
     {
        try
        {
           System.out.println(num[i]/den[i]);
        }
        catch(ArithmeticException e)
        {
           System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println("Index out of bound exception");
          throw e;
        }
     }
  }
}
class rethrow
{
   public static void main(String args[])
   {
      try
      {
         rethrown.genexe();
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("programm terminated");
      }
   }
}
