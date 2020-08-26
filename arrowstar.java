class arrowstars
{
  public static void main(String args[])
  {
     int n=4;
     for(int i=1;i<=n;i++)
     {
        for(int j=n/2-1;j>0;j--)
        {
           System.out.print("      ");
        }
        for(int j=n/2;j<=i;j++)
        {
           System.out.print(" * ");
        }
        System.out.println();
     }
     for(int i=1;i<=n+2;i++)
     {
         System.out.print(" * ");
     }
     System.out.println();
     for(int i=1;i<=n;i++)
     {
        for(int j=n/2-1;j>0;j--)
        {
           System.out.print("      ");
        }
        for(int j=n-1;j>=i;j--)
        {
           System.out.print(" * ");
        }
        System.out.println();
     }
  }
}
