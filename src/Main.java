public class Main {
    public static void main(String[] args)
    {
        int [][]mat=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        int n=mat.length;
        if(n==1)
        {
            System.out.println(mat[0]);
        }
        for(int i=0;i<mat.length;i++)
        {
            sum=sum+mat[i][i];

        }
        int k=0,j=n-1;
        while(k<n && j>=0)
        {
            sum=sum+mat[k][j];
            System.out.println(mat[k][j]);
            k++;
            j--;

        }
            if(mat.length%2==1)
            {
                sum=sum-mat[n/2][n/2];
            }
        System.out.println(sum);
        }

    }
