interface infig
{
  void area();
  void disp();
  void peri()

}
class rect implements infig
{
  int dim1=5,dim2=10;
  public void disp(){System.out.println("dim1="+dim1+"dim2="+dim2);}
  public void area(){System.out.println("area of rect="+(dim1*dim2));}
  public void peri(){System.out.println("peri of rect="+(2*(dim1*dim2)));}
}
class ddddemointerface
{
  public static void main(String args[])
  {
    rect r1=new rect();
    r1.area();
    r1.peri();
    r1.disp();

  }
}
