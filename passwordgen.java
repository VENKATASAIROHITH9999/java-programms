import java.util.Random;/*importing random package*/
class demopass
{
   int len;
   demopass(int len)
   {
      this.len=len;
   }
   void display()
   {
     char t[]=new char[len];/*charecter array to generate password*/
     String str="QWERTYUIOPASDFGHJKLZXCVBNM";
     String str1="qwertyuiopasdfghjklzxcvbnm";
     String str2="!@#$%^&*<>?";
     String str3="1234567890";
     String stringtot=str+str1+str2+str3;/*all strings concatinated*/
     System.out.println("Generating password.......");
     System.out.print("Your password is:");
     for(int i=0;i<len;i++)/*loop to create random password of given length*/
     {
       Random ran=new Random();/*random object*/
       int abc=ran.nextInt(73);/*index (have the count of total charecters in stringtot String)total charecters are 73*/
       t[i]=stringtot.charAt(abc);/*assigning random generated values to the array*/
       System.out.print(t[i]+"");/*printing array i.e Generating password*/
     }
   }
}
class passwordgen
{
  public static void main(String args[])/*main() method*/
  {
   demopass obj=new demopass(10);/*constructor to access methods and members of demopass classand sending parameters i.e length of password*/
   obj.display();/*calling display method*/
   }
}
