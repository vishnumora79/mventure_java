public class matrix_examples 
{
    public static void main(String arhs[])
    {
        int n = 9;
        for(int i=1;i<n;i++)
        {
            int k = 1;
            for(int j=i;j<n+i;j++)
            {
                if (j > 9)
                {
                 System.out.print(k + " ");
                 k++;
                }
                else
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
}