abstract class fig
{
   int x,y;
   fig(int x,int y)
   {
     this.x=x;
     this.y=y;
   }
   abstract void area();
}
class tri extends fig
{
   tri(int x,int y)
   { 
      super(x,y);
   }
   void area()
   {
      System.out.println("area of tri is="+(x*y)/2);
   }
}
class rect extends fig
{
  rect(int x,int y)
  {
    super(x,y);
  }
  void area()
  {
     System.out.println("area of rect="+(x*y));
  }
}
class abstractdemo
{
   public static void main(String args[])
   {
      rect obj=new rect(5,50);
      tri objt=new tri(3,30);
      obj.area();
      objt.area();
   }
}