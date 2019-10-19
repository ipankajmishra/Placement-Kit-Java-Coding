import java.util.*;
class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String bin = Integer.toBinaryString(n);
    int count=0;
    int max=0;
    for(int i=0;i<bin.length()-1;i++)
    {
      if(bin.charAt(i)==bin.charAt(i+1))
      {
        if(count==0)
        {
          count=count+2;
        }
        else
        {
          count++;
        }

        if(count>max)
        {
          max=count;
        }
      }
      else{
        count=0;
      }
    }
    System.out.println(bin);
    if(max==0 && n != 0)
    {
      System.out.println("1");
    }
    else{
      System.out.println(max);
    }


  }
}
