class outer
{
   int x=5;
   class innerclass
   {
       int y=10;
   }
}
class nestclass
{
  public static void main(String args[])
  {
   outer obo=new outer();
   outer.innerclass obi=obo.new innerclass();
   System.out.println(obo.x+obi.y);
  }
}
