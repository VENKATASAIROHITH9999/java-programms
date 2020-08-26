 class exxc
 {
    public static void main(String args[])
    {
       int a[]={1,2,3,4};
       int sum=0;
       try/*exception occures in this block*/
       {
          for(int i=0;i<5;i++)
          {
             sum+=a[i];
          }
       }
       catch(ArrayIndexOutOfBoundsException e)/*catches the exception in try block*/
       {
           System.out.println("Exception occured="+e);
       }
       System.out.println("sum="+sum);
    }
 }
