class mythread extends Thread
 {
 public void run(){
 System.out.println(" Inside :"+ Thread.currentThread().getName() + " Priority is " +
Thread.currentThread().getPriority() );
 }
 }
 class getpriorityDemo
 {
 public static void main(String[] args)
 {
 System.out.println("Inside : " + Thread.currentThread().getName() );
 System.out.println("starting first Thread");
 mythread m=new mythread();
 m.start();
 mythread p=new mythread();
 p.start();
 System.out.println("Ending of Main Thread");
 }
}
