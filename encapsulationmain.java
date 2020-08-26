class pert
{
  String name;
  private int no;
  void setno(int no)
  {
    this.no=no;
  }
  int getno()
  {
     return no;
  }
}
class encapsulationmain
{
   public static void main(String args[])
   {
      pert p=new pert();
      p.setno(35);
      p.name="nani";
      System.out.println("no="+p.getno()+"\n"+"name="+p.name);
   }
}
