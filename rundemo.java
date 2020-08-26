class mythread implements Runnable
{
   /*ste1:implement interface*/
   public void run()/*step override run()*/
   {
      System.out.println("Thread Execution started");
   }
}
class rundemo
{
  public static void main(String args[])
  {
    System.out.println("Before thread execution starts");
    mythread m=new mythread();/*step 3:create object*/
    Thread t=new Thread(m);
    t.start();/*invoking run()*/
    System.out.println("After thread execution");
  }
}
