import java.util.Scanner;

class array_pattern 
{

    public static void main(String args[]) 
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = s.nextLine();

        int n = word.length();
        
        // if(n % 2 == 0)
        //  {
        //     System.out.println(word + " is not a valid one to print the pattern");
        // }

        // else 
        // {
                for(int i=0;i<n;i++)
                 {
                    for(int j=0;j<n;j++)
                     {
                        if(i == j)
                         {
                            System.out.print(word.charAt(i) + "  ");
                        }
                        else if(j == (n - 1) - i) 
                        {
                            System.out.print(word.charAt((n-1)-i) + "  ");
                        }
                        else
                         {
                            System.out.print("  ");
                        } 
                    }
                    System.out.println();
                }
        }

    }
// }