import java.util.*;
import java.lang.*;
class Test{
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int m =sc.nextInt();
    int n = sc.nextInt();
    int[][] arr = new int[m][n];
    int[][] out = new int[m][n];
    List<Integer> row = new ArrayList<>();
    List<Integer> col = new ArrayList<>();
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        arr[i][j]=sc.nextInt();
        if(arr[i][j]==1)
        {
          row.add(i);
          col.add(j);
        }
      }
    }


    for(int k=0;k<m;k++)
    {
      for(int l=0;l<n;l++)
      {
          if(arr[k][l] == 1)
          {
            out[k][l] = 0;
          }
          else
          {
            int[] temp = new int[row.size()];
            for(int b=0;b<row.size();b++)
            {
              temp[b]=Math.abs(k-row.get(b))+Math.abs(l-col.get(b));
            }
            Arrays.parallelSort(temp);
            out[k][l]=temp[0];
          }
      }
    }

  for(int p=0;p<m;p++)
  {
    for(int q=0;q<n;q++)
    {
      System.out.print(out[p][q]);
    }
    System.out.println();
  }

  }
}
