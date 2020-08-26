class rectanglesss
{
   int len,bre;
   rectanglesss(int le,int br){
   len=le;
   bre=br;
   area();
   peri();
   }
   void area(){
   System.out.println(len*bre);}
   void peri()
   {
     System.out.println(2*(len+bre));
   }
}
class squre extends rectanglesss
{
   squre(int s)
   {
     super(s,s);
   }
}
class main
{
   public static void main(String args[])
   {
      squre obj=new squre(5);
      rectanglesss objr=new rectanglesss(5,3);
   }
}
   