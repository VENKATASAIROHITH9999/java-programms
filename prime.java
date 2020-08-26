import java.util.*;
class prime
{
  public static void main(String args[])
  {
     int num;
     Scanner a=new Scanner(System.in);
     num=a.nextInt();
     System.out.println("given num="+num);
     for(int i=2;i<=num;i++)
     {
        if(num%i==0)
        {
           System.out.println("the given num is prime");
        }
        else
        {
           System.out.println("the given num is not prime");
         }
    }
  }
}
