interface motor
{
  int speed=1500;
  void dist();
}
interface cycle
{
  int dist=500;
  void speed();
}
class body  implements motor,cycle
{
  int avgspeed;
  int travel;
  public void dist()
  {
    travel=speed*60;
    System.out.println("distance covered in 60 sec="+travel);
  }
  public void speed()
  {
    avgspeed=dist/60;
    System.out.println("Speed covered on avg 60 seconds="+avgspeed);
  }
}
class motormain
{
  public static void main(String args[]){
  body a=new body();
  a.dist();
  a.speed();
}
}
