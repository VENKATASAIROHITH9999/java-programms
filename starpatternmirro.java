class starpat
{
  int n;
  starpat(int n)
  {
     this.n=n;
  }
  void pattern()
  {
     for(int i=1;i<=n;i++)
     {
        for(int j=n-i;j>0;j--)
        {
           System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print("*");
        }
        System.out.println();
     }
  }
}
class starpatternmirro
{
  public static void main(String args[])
  {
     starpat obj=new starpat(5);
     obj.pattern();
  }
}
