class starpat
{
  int n;
  starpat(int n)
  {
     this.n=n;
  }
  void pattern()
  {
     for(int i=0;i<n;i++)
     {
        for(int j=n-1;j>=i;j--)
        {
           System.out.print(" * ");
        }
        System.out.println();
     }
  }
}
class starpatternrev
{
  public static void main(String args[])
  {
     starpat obj=new starpat(5);
     obj.pattern();
  }
}
