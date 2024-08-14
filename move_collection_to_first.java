public class move_collection_to_first {
    public static void main(String args[])
    {
        int i, j, k = 4,temp=0,v = 0;
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int m = (n - k) - 1;
        
        for(i=0;i<n;i++) 
        {
            if(i > m)
            {
                temp = arr[i];
                for(j = i;j > v;j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[v] = temp;
                v++;

            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
