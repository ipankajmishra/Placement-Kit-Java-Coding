import java.util.*;
import java.lang.Math;
class Sudoku{
     public static void main(String[] args) {
         //Scanner sc = new Scanner(System.in);
         //int[][] mat = new int[9][9];
        //System.out.print(s);
        /*for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }*/
        int[][] mat = new int[][] 
    { 
            {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
    }; 
        int n=9;
        if(soduku(mat,n))
        {
            printSoduku(mat,n);

        }
        else{
            System.out.print("-1");
        }

    }
    public static boolean soduku(int[][] mat,int n)
    {
        int row=0,col=0;
        boolean brek = true;
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<n;l++)
            {
                if(mat[k][l]==0)
                {
                    row=k;
                    col=l;
                    brek = false;
                    break;
                }
            }
            if(!brek)
            {
                break;
            }
        }
        if(brek)
        {
            return true;
        }

        for(int x=0;x<n;x++)
        {
            if(isSafe(mat,row,col,x))
            {
                mat[row][col] = x;
                if(soduku(mat,n))
                {
                    return true;
                }
                else
                {
                    mat[row][col]=0;
                }
                
            }
        }
        return false;
        
    }
    
    public static boolean isSafe(int[][] mat,int row,int col, int x)
    {
        for(int g=0;g<mat.length;g++)
        {
            if(mat[row][g]==x)
            {
                return false;
            }
        }
        for(int h=0;h<mat.length;h++)
        {
            if(mat[h][col]==x)
            {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(mat.length);
        int startRow = row - row%sqrt;
        int startCol = col - col%sqrt;
        for(int u=startRow;u<startRow+sqrt;u++)
        {
            for(int v=startCol;v<sqrt+startCol;v++)
            {
                if(mat[u][v]==x)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void printSoduku(int[][] mat,int n)
    {
        for(int q=0;q<n;q++)
        {
            for(int o=0;o<n;o++)
            {
                System.out.print(mat[q][o]);
            }
            System.out.println();
        }
    }
}