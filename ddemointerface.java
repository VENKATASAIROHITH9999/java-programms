interface infig
{
  void area();

}
class rect implements infig
{
  int dim1=5,dim2=10;
  public void area(){System.out.println("dim1="+dim1+"dim2="+dim2);}

}
class ddemointerface
{
  public static void main(String args[])
  {
    rect r1=new rect();
    r1.area();

  }
}
