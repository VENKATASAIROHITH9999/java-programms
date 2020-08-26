class starpat
{
  int n;/*instance variable*/
  starpat(int n/*parameter passed*/)
  {
     this.n=n;
  }
  void pattern()
  {
     for(int i=1;i<=n;i++)/*for loop defines number of rows*/
     {
        for(int j=n-i;j>0;j--)/*this for loop defines number of coulums that should be blank spaces*/
        {
           System.out.print(" ");
        }
        for(int j=1;j<=i;j++)/*this also defines coulums that specify indext to pront'*' */
        {
          System.out.print("* ");
        }
        System.out.println();
     }
  }
}
class starpatternpy
{
  public static void main(String args[])/*main method*/
  {
     starpat obj=new starpat(5);/*starpat class constructor*/
     obj.pattern();
  }
}
