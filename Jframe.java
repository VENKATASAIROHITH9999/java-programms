import javax.swing.JFrame;
public class FirstGUI
{
   public static void main(Sring args[])
   {
     ABC obj=new ABC();


   }
}
class ABC extends JFrame/*card layout*/
{
   public abc()
   {
   setLayout(new FlowLayout);
   JLabel l=new JLabel("hello world");
   JLabel k=new JLabel("rohith rocks");

   add(k);
   add(l);
   obj.setVisibility(true);
   obj.setSize(200,200);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
   }
}
