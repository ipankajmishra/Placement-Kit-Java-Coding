import java.util.*;
class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int l = (m>n)?m-n:n-m;
    int ll = Math.max(m,n);
    int[] a = new int[ll];
    int[] b = new int[ll];
    int i,j;
    if(m==n+l)
    {

      for (i=0;i<m ;i++ ) {
        a[i]=sc.nextInt();
      }
      for (j=l;j<m ;j++ ) {
        b[j]=sc.nextInt();
      }
    }
    else if(n==m+l)
    {

      for (i=l;i<n ;i++ ) {
        a[i]=sc.nextInt();
      }
      for (j=0;j<n ;j++ ) {
        b[j]=sc.nextInt();
      }
    }
    int carry = 0;
    int[] sum = new int[ll];
    for(int k=ll-1;k>=0 ;k-- ) {
      sum[k]=a[k]+b[k]+carry;
      if(Integer.toString(sum[k]).length()>1)
      {
        int temp=(sum[k]-(sum[k]%10))/10;
        if(k!=0)
        {
          sum[k]=(sum[k]%10);
        }
        else
        {
          sum[k]=(sum[k]);
        }

        carry = temp;
      }
      else{
        carry=0;
      }
    }

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(sum));
    for(int p = 0;p<sum.length;p++)
    {
      if(sum[p]>9)
      {
          String ss = Integer.toString(sum[p]);
          ss = ss.replaceAll(""," ");
          System.out.print(ss.substring(1,ss.length()));
      }
      else
      {
        System.out.print(sum[p]+" ");
      }
    }
  }
}
