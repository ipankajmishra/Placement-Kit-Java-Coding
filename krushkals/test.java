import java.util.*;
class Edge{
  int src,dest,weight;
  public Edge(int src,int dest,int weight)
  {
    this.src = src;
    this.dest = dest;
    this.weight = weight;
  }
  @Override
  public String toString(){
    return  "(" + src +","+dest+","+weight+")";
  }

};

class Disjoint{
  Map<Integer,Integer> parent = new HashMap<>();

  public void makeSet(int N)
  {
    for(int p=0;p<N;p++)
    {
      parent.put(p,p);
    }
  }



  private int Find(int k)
  {
    if(parent.get(k) == k)
      return k;
    return Find(parent.get(k));
  }


  private void Union(int a,int b)
  {
    int x=Find(a);
    int y=Find(b);
    parent.put(x,y);
  }


  public static List<Edge> Kruskals(List<Edge> edges, int N)
  {
    List<Edge> MST = new ArrayList();
    Disjoint ds = new Disjoint();
    ds.makeSet(N);

    int index=0;
    while(MST.size() != N - 1)
    {
      Edge next_edge = edges.get(index++);
      int x = ds.Find(next_edge.src);
      int y = ds.Find(next_edge.dest);

      if( x!=y)
      {
        MST.add(next_edge);
        ds.Union(x,y);
      }
    }
    return MST;
  }



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Edge> edges = new ArrayList<>();
      System.out.println("Enter the number of Edges");
      int n = sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int s = sc.nextInt();
        int d = sc.nextInt();
        int w = sc.nextInt();
        edges.add(new Edge(s,d,w));
      }
      Collections.sort(edges, (a,b) -> a.weight - b.weight);
      System.out.println(edges);
      System.out.println("Enter number of vertices");
      int N = sc.nextInt();
      List<Edge> e = Kruskals(edges,N);
      for(Edge edge:e)
      {
        System.out.println(edge);
      }

  }
}
