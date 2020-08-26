import java.util.*;
class javaswitch
{
   public static void main(String args[])
   {
      boolean andd=false;
      Scanner scanned=new Scanner(System.in);
      String str= scanned.next();
      char ch=str.charAt(0);
      System.out.println("ch="+ch);
      scanned.close();
      switch(ch)
      {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':andd=true;
     }
     if(andd=true)
     {
        System.out.println("the charecter is vowel");
     }
     else
     {
        
        
           System.out.println("the Charecter is not a vowel");
        
     }
}
}

   
     