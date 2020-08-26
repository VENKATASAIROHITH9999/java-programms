class mythread extends Thread
{
  /*step 1 create subclas thread class*/
  public void run()/*override run method*/
  {
     System.out.println("Thread is executing");

  }
}
class threaddemo
{
   public static void main(String args[])
   {
     System.out.println("before invoking Thread");
     mythread t=new mythread();/*step 3:create object*/
     t.start();/*step 4:start invokatiion*/
     System.out.println("After thread oinvocation");
   }
}
