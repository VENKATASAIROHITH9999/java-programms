import java.awt.*;
class first extends Frame
{
   first()
   {
      Button obj=new Button("click here");
      obj.setBounds(20,100,80,20);
      add(obj);
      setSize(200,200);
      setLayout(null);
      setVisible(true);
   }
}
class awtgetst
{
   public static void main(String args[])
   {
      first f=new first();
   }
}
