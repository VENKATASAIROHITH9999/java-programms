class rectanglearea
{
   int len,bre;
   rectanglearea(int len,int bre)
   {
   this.len=len;
   this.bre=bre;
   }
   void area(){
   System.out.println(len*bre);
   }
}

class rarearr
{
   public static void main(String args[])
   {
      rectanglearea obj=new rectanglearea(5,3);
      obj.area();
   }
}
