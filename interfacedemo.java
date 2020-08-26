interface inter1
{
  void morning();
  void night();
}
class say implements inter1
{
   public void morning()
   {
       System.out.println("hi,good mornig");
   }
   public void night()
   {
       System.out.println("good night,sweet dreams");
   }
}
class interfacedemo
{
   public static void main(String args[])
   {
       say obj=new say();
       obj.morning();
       obj.night();
   }
}