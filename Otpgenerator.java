import java.util.Random;/*importing random package*/
class naniOTP
{
  int len;
  naniOTP(int len)
  {
     this.len=len;
  }
   void display()
   {
       int otpt[]=new int[len];/*array to store OTP*/
       System.out.println("Generating otp.....");
       System.out.print("Your OTP is:");
       for(int i=0;i<len;i++)/*loop to generate OTP of given length*/
       {
          Random obj=new Random();/*random object creation*/
          int str2=obj.nextInt(10);/*random numbers between 0 to 10 are generated*/
          otpt[i]=str2;/*generated random numbers are assigned to an array*/
           System.out.print(otpt[i]+"");/*printing or generating OTP*/
       }

   }
}
class OTPgenerator
{
  public static void main(String args[])/*main method*/
  {
    naniOTP obm=new naniOTP(4); /*constructor to access methods/members of naniOTP class*/
    obm.display();/*calling display method to generate OTP*/
  }
}
