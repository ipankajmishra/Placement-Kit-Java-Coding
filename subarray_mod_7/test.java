import java.util.*;
class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mod = sc.nextInt();
    int[] arr = new int[n];
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i;j<arr.length;j++)
      {
        int count=0;
        for(int k=i;k<=j;k++)
        {
          count+=arr[k];
          System.out.print(arr[k] + " ");
        }
        list.add(count%mod);
        System.out.println();
      }

    }
    System.out.println(list);
    Collections.sort(list);
    Collections.reverse(list);
    System.out.println(list);
    System.out.print(list.get(0));
  }
}
