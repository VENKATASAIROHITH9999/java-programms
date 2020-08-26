interface ParInter
{
void meth1();
void meth2();
}
interface SubInter extends ParInter
{
void meth3();
}
class InheriInter implements SubInter // should implement all 3 methods
{
public void meth1() { System.out.println("meth1() implemented"); }
public void meth2() { System.out.println("meth2() implemented"); }
public void meth3() { System.out.println("meth3() implemented"); }
}
class IfextendDemo // use refence obj of SubInter to call the methods
{
public static void main(String args[])
{
InheriInter ob1 = new InheriInter();
ob1.meth1();
}
}
