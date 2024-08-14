public class array_triangle
{
    public static void main(String args[])
    {
        int i,j,k = 0,a[] = {4,7,3,6,7};
        int result[][] = new int[6][6];
        int n = a.length;
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        {
            if(i == 0)
            {
                result[i][j] = a[j];
            }
            else 
            {
                if(j < (n - k))
                {
                result[i][j] = (result[i-1][j] + result[i-1][j+1]);
                }
                else
                {
                result[i][j] = 0;
                }
            }    
        }
        k++;
        }

        for(i=n-1;i >= 0;i--)
        {
            for(j=0;j<n;j++)
            {
                if(result[i][j] == 0)
                System.out.print(" ");
                else
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

