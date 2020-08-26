class complex
{
   int real,imag;
   complex()
   {
     real=imag=5;
   }
   double modulus()
   {
     double r;
     r=Math.sqrt(real*real+imag*imag);
     return r;
   }
   void add(complex x)
   {
     int rp,ip;
     rp=x.real+real;
     ip=x.imag+imag;
     System.out.println("rp="+rp+"\n"+"+i"+ip);
   }
   public static void main(String args[])
   {
      complex c1=new complex(),c2=new complex();
      c2.add(c1);
   }
}
