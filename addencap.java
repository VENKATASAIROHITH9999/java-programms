class pert
{
  private int no1,no2;
  void setno(int no1,int no2)
  {
    this.no1=no1;
    this.no2=no2;
  }
  int getno()
  {
     int no=no1+no2;
     return no;
  }
}
class addencap
{
   public static void main(String args[])
   {
      pert p=new pert();
      p.setno(35,25);
      System.out.println("no="+p.getno());
   }
}
