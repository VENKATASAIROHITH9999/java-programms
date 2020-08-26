class mythread extends Thread
 { public void run(){
 System.out.println(" Inside :"+Thread.currentThread().getName() );
 }
 }
 class getnameDemo
 {
 public static void main(String[] args)
 {
 System.out.println("Inside : " + Thread.currentThread().getName() );
 System.out.println("starting first Thread");
 mythread m=new mythread();
 m.start();
 System.out.println("Ending of Main Thread");
 }
 }
