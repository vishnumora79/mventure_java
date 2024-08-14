public class end_zeroes 
{
    public static void main(String args[])
    {
        int arr[] = {0,2,1,3,0,3,0,2,0};
        int n = arr.length;
        // int i,j=0,temp;
        
        // for(i=0;i<n;i++)
        // {
        //     if(arr[i] != 0)
        //         {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //             j++;
        //         }
        //     }

        // counting and placing all the non-zero elements in the beginning of an array
        int i, count = 0;
        for(i=0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                arr[count++] = arr[i];
            }
        }
        // filling the remaining elements with zeroes
        while(count < n)
        {
            arr[count++] = 0;
        }
        //  printing the final array
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        
    }
}