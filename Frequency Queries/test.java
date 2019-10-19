import java.util.*;
class Test{
  public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    for(int i=0; i<n; i++)
    {

      int a = sc.nextInt();
      int b = sc.nextInt();
      map.put(a,b);

    }
    
    System.out.println(map);
    System.out.println(map.get(1));
  }
}
