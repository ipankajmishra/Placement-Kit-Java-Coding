import java.util.*;
class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder str  = new StringBuilder();
    int n = sc.nextInt();
    int count = 0;
    int x = 26;
    int q = 0;
    while(x > 25)
    {
      q = n / 26;
      x = n % 26;
      count++;
    }
    int  y = x;
    System.out.println(q);
    System.out.println(count);
    System.out.println(y);
    if(y!=0)
    {
      for(int i = 0;i< q ;i++)
      {

        str.append('a');

      }
    }
    else{
      for(int i = 0;i< q-1 ;i++)
      {

        str.append('a');


      }
      y=y+26;
    }

    int z = 96+y;
    System.out.println(z);
    System.out.println(str.toString() + (char) z);

  }
}
