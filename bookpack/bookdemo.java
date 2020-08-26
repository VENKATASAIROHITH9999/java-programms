package bookpack;/*packages contain classes*/
class book
{
   String title;
   int year;
   book(String title,int year)/*book method takes parameter from main method constructor*/
   {
      this.title=title;/*this specifies difference between instance and local variables*/
      this.year=year;
   }
   void display()
   {
    System.out.println("TITLE IS "+title +"\n"+"PUBLISHED IN YEAR "+year);
   }
}
class bookdemo
   {
     public static void main(String args[])/*main() method*/
     {
        book obj=new book("THE ADVENTURES OF SHERLOCK HOLMES",1813);/*CONSTRUCTOR CALLING BOOK METHOD*/
        obj.display();/*calling display() method*/
     }
   }
