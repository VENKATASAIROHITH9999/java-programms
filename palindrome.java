import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
      String a1,rea1="";
      a1=args[0];
      int length=a1.length();
      for(int i=length-1;i>=0;i--)
      rea1=rea1+a1.charAt(i);
      if(a1.equals(rea1))
      {
        System.out.println("it is a palindrome");
      }
      else 
      {
          System.out.println("not a aplindrome");
      }
  }
}