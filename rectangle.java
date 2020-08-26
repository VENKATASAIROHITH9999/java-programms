class rectangle
{
   int len,bre;
   rectangle(int len,int bre){
   this.len=len;
   this.bre=bre;}
   void area(){
   System.out.println(len*bre);}
   void peri()
   {
     System.out.println(2*(len+bre));
   }
}
class squre extends rectangle
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
      rectangle objr=new rectangle(5,3);
   }
}
   