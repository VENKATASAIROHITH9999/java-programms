class rectanglearea
{
   int len,bre;
   rectangle(int len,int bre)
   {
   this.len=len;
   this.bre=bre;
   }
   void area(){
   System.out.println(len*bre);
   }
   void area()
   {
     System.out.println(len*bre);
   }
}

class area
{
   public static void main(String args[])
   {
      rectangle obj=new rectangle(5,3);
      obj.area();
   }
}
