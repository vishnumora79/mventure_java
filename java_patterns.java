class java_patterns {
    public static void main(String args[]) {
        // for(int i=1;i<=5;i++) {               // o/p: *****
        //     System.out.print("*");
        // }



        // for(int j=1;j<=5;j++) {
        //     System.out.println("*"+ " ");       // * and other * in line                                      
        // }



        // for(int i=1;i<=5;i++) { 
        //            // printing _ _ _ _ _ * * * * * for 5 rows
        //     for(int j=1;j<=5;j++) {
        //         System.out.print("_ "); 
        //     }

        //     for(int k=1;k<=5;k++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }




        // for(int i=1;i<=5;i++) {
        //     for(int j=1;j<=i;j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }



        // for(int i=1;i<=5;i++) {
        //     for(int j=5;j>=i;j--) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


     

        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }



        // for(int i=1;i<=5;i++) {
        //     for(int j=1;j<=i;j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=5;k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // for(int i=1;i<=5;i++) {        // Equilatoral triangle
        //     for(int j=5;j>=i;j--) {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++) {
        //         System.out.print("*");
        //     }
        //     for(int l = 1;l<i;l++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     // for(int n = 0;n<=i;n++) {
        //     //     System.out.print(" ");
        //     // }
        // }



        // for(int i=1;i<=5;i++) {            // House
        //     for(int k=5;k>=i;k--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=(2*i-1);j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int l = 1;l<=5;l++) {
        //         System.out.print(" ");
        //     for(int m = 1;m<=9;m++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // Hallow square
        // for(int i=1;i<=5;i++) {
        //     for(int j=1;j<=5;j++) {
        //         if(i == 1 || i == 5 || j == 1 || j== 5)
        //         System.out.print("*");
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=5;i++) {            // House with door
        //     for(int k=5;k>=i;k--) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=(2*i-1);j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int l = 1;l<=5;l++) {
        //         System.out.print(" ");
        //     for(int m = 1;m<=9;m++) {
        //         if(( (l == 3 || l == 4 || l == 5) && (m == 4 || m == 5 || m == 6 )))
        //         System.out.print(" ");
        //         else
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

        // for(int i=1;i<=10;i++) {         // Letter A
        //     for(int j = 1;j<=10;j++) {
        //         if(i == 1 || i == 5 || j == 1 || j == 10) {
        //             System.out.print("*");
        //         }
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=10;i++) {        // Letter B
        //     for(int j=1;j<=10;j++) {
        //         if((i== 1 && j == 10) || (i == 5 && j == 10) || i == 10 && j == 10) {
        //             System.out.print(" ");
        //         }
        //         else if(i == 1 || j == 1 || i == 10 || j == 10 || i == 5)
        //         System.out.print("*");
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        // // Letter C
        // for(int i=1;i<=10;i++) {
        //     for(int j = 1;j<=10;j++) {
        //         if((i == 1 && j == 1) || (i == 10 && j == 1) || (i == 1 && j == 2 ) || (i == 10 && j == 2)) {
        //             System.out.print(" ");
        //         }
        //         else if( i == 1 || i == 10 || j == 1) {
        //             System.out.print("*");
        //         }
        //         else 
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
    }
    
}














/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

// #include <stdio.h>

// int main()
// {
//   int n = 5;
//   for(int i=1;i<=5;i++)
//   {
// //       for(int s = n-i;s >= 0;s--)
// //       {
// //           printf(".");
// //       }
//       for(int j = 1;j<=(i*2-1);j++)
//       {
//           printf("*");
//       }
//       printf("\n");
//   }
// }


// #include "stdio.h"
// // #include "stdlib.h"
// int main()
// {
//     int n = 4;
//     for(int i=-n;i<=n;i++)
//     {
//         for(int s = 1;s<=abs(i);s++)
//         {
//             printf(" ");
//         }
//         for(int j=1;j<=n-abs(i);j++)
//         {
//             printf("* ");
//         }
//         printf("\n");
//     }
// }


// #include<stdio.h>
// #include "stdlib.h"
// int main()
// {
//     int n = 5;
//     for(int i=-n;i<=n;i++)
//     {
//         for(int s = 1;s <= abs(i);s++)
//         {
//             printf(" ");
//         }
//         for(int j = 1;j< (n - abs(i))*2;j++)
        
//         {
//             printf("*");
//         }
//         printf("\n");
//     }
// }

// #include<stdio.h>

// int main()
// {
//     int n = 5;
//     for(int i=-n;i<=n;i++)
//     {
//         for(int s = 1;s <= n - abs(i);s++)
//         {
//             printf(" ");
//         }
//         for(int j = 1;j<=abs(i) + 1;j++)
//         {
//             printf("*");
//         }
//         printf("\n");
//     }
// }

// #include<stdio.h>

// int main()
// {
//     int n = 5;
//     for(int i=-n;i<=n;i++)
//     {
//         for(int s = 1;s <= n - abs(i);s++)
//         {
//             printf(" ");
//         }
//         for(int j = 1;j<=abs(i) + 1;j++)
//         {
//             printf("* ");
//         }
//         printf("\n");
//     }
// }


// #include<stdio.h>
// int main()
// {
//     int n = 5;
//     for(int i=0;i<=n;i++)
//     {
//         for(int j = -n;j<=n;j++)
//         {
//             if(-i <= j && j <= i)
//             {
//                 if(j != 0)
//                 printf("  ");
//             }
//             else
//             printf("* ");
//         }
//         printf("\n");
//     }
// }


// #include<stdio.h>
// int main()
// {
//     int n = 5;
//     for(int i=0;i<n;i++)
//     {
//         for(int j = -n;j<=n;j++)
//         {
//             if(-i <= j && j <= i)
//             {
//                 if(j != 0)
//                 printf("  ");
//             }
//             else
//             printf("* ");
//         }
//         printf("\n");
//     }
//     for(int i=1;i<=n;i++)
//     {
//         for(int j = -n;j<=n;j++)
//         {
//             if(-(n-i) <= j && j <= (n-i))
//             {
//                 if(j != 0)
//                 printf("  ");
//             }
//             else
//             printf("* ");
//         }
//         printf("\n");
//     }
// }



// #include<stdio.h>
// int main()
// {
//     int n = 5;
//     int size = n*2 - 1;
//     int a[size][size];
//     int start = 0,end = size;
//     while(n != 0)
//     {
//     for(int i=start;i<end;i++)
//      {
//         for(int j=start;j<end;j++)
//         {
//             a[i][j] = n;
//         }
//      } 
//       start++;
//     end--;
//     n--;
//     }
    
//     for(int i=0;i<=size-1;i++)
//     {
//         for(int j=0;j<=size-1;j++)
//         {
//             printf("%d ",a[i][j]);
//         }
//         printf("\n");
//     }
   
    
// }








