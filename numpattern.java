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
        for(int j=0;j<=i;j++)
        {
           System.out.print( + i );
        }
        System.out.println();
     }
  }
}
class numpattern
{
  public static void main(String args[])
  {
     starpat obj=new starpat(5);
     obj.pattern();
  }
}
