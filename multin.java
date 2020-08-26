class met1
{
  void merx()
  {
    System.out.println("this is method 1");
  }
}
class met2 extends met1
{
  void mety()
  {
    System.out.println("this is method 2");
  }
}
class met3 extends met2
{
  void metz()
  {
    System.out.println("this is met 3");
  }
}
class multilevelinherit
{
  public static void main(String args[])
  {
    met3 ob=new met3();
    ob.merx();
    ob.mety();
    ob.metz();
  }
}
