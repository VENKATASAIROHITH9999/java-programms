class test
{
  int a,b;
  test(int i,int j)
  {
     a=i;
     b=j;
  }
  boolean equalTo(test o)
  {
     if(o.a==a && 0.b==b)
     {
       return true;
     }
     else
     {
      return false;
     }
  }
}
class passobj
{
   public static void main(String args[])
   {
      test ob1=new test(101,202);
      test ob2=new test(101,202);
      test ob3=new test(-123,-345);
      System.out.println("ob1==ob2="+ob1.equalTo(ob2));
      System.out.println("ob1==ob3="+ob1.equalTo(ob3));
   }
}
