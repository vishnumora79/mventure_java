import java.util.Scanner;

public class array_iteration 
{
    public static void main(String args[])
    {
        int a[] = {1,9,5,1,7,9,1,24};
        int n = a.length;
        int b[] = new int[n];
        int k = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                   int c = 0;
                   for(int m = 0;m<=k;m++)
                   {
                    if(b[m] == a[i])
                       c++;
                   }
                   if(c == 0)
                   {
                    b[k] = a[i];
                    k++;
                   }
                }
                
            }
        }
        for(int i=0;i<k;i++) 
          System.out.print(b[i] + " ");
          
    }
}