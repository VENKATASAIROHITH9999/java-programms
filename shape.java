class shape
{
  public void print()
  {
    System.out.println("this is shape");
  {
}
class rectangle extends shape
{
  public void print1()
  {
     System.out.println("this is rectangle");
  }
}

class squre extends rectangle
{
   public void print3()
   {
     System.out.println("this is squre extended rectangle");
   }
}
class finalmain 
{
  public static void main(String args[])
  {
    squre obj=new squre();
    obj.print3();
    obj.print1();
    obj.print();
    
  }
}