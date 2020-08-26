class demo1
{
  public static void main (String args[])
  {
     int a[]={10,20,30,40};
     int sum=0;
     try{for(int i=0;i<6;i++);sum+=a[i];}
     catch(ArthimeticException e)
     {
       System.out.println(e);
       System.out.println("arthametic exception");
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
        System.out.println(e);
        Systrm.out.println("array indexout of bounds exception");
     }
     System.out.println("Aftrer catch");
  }
}
