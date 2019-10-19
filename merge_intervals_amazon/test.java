import java.util.*;
class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[2*n];
    for(int i=0;i<2*n;i++)
    {
      arr[i]=sc.nextInt();
      arr[i+1]=sc.nextInt();
      i++;
    }
    //list.add(arr[0]);
    for(int j = 0;j<2*n;j++)
    {
      System.out.print(arr[j]+" ");
    }
    System.out.println();
    for(int k=0;k<2*n-3;k++)
    {
      if(arr[k+1]>arr[k+2])
      {
        arr[k+1]=0;
        arr[k+2]=0;
      }
      else{

      }
      k++;
    }
for(int j = 0;j<2*n;j++)
    {
      if(arr[j]!=0)
      {
        System.out.print(arr[j]+" ");
      }

    }
  }
}
