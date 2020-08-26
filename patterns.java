class patterns
{
  public static void main(String[] args)
  {
     final String name=" I love you ";
     final int n=8;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
           double d1=Math.sqrt(Math.pow(i-n,2)+Math.pow(j-n,2));
           double d2=Math.sqrt(Math.pow(i-n,2)+Math.pow(j-3*n,2));
           if(d1<n+0.5||d2<n+0.5)
           {
              System.out.print('*');
           }
           else
           {
              System.out.print(' ');
           }
        }
        System.out.println(System.lineSeparator());
    }
    for(int i=1;i<2*n;i++)
    {
       for(int j=0;j<i;j++)
       {
          System.out.print(' ');
       }
       for(int j=0;j<4*n+1-2*i;j++)
       {
          if(i>=8&&i<=10)
          {
             int id=j-(4*n-2*i-name.length())/2;
             if(id<name.length()&&i>=0)
             { 
              if(i==3)
              {
                  System.out.print(name.charAt(id));
              }
              else
              {
                 System.out.print(' ');
              }
             }
             else
             {
                 System.out.print('*');
             }
           }
           else
           {
             System.out.print('*');}
           }
           System.out.print(System.lineSeparator());
         }
      }
} 
