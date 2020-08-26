class excep
{
  public static void main (String args[])
  {
     int a[]={10,20,30,40};
     int sum=0;
     int i;
     try{for( i=0;i<6;i++);sum+=a[i];}
     catch(ArithmeticException e)
     {
       System.out.println(e);
       System.out.println("arthametic exception");
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
        System.out.println(e);
        System.out.println("array indexout of bounds exception");
     }
     System.out.println("Aftrer catch");
  }
}
