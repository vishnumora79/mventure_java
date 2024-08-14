// # Python
// # input_str = input("Enter the string:")

// # result = ''

// # for i in input_str:
// #     if i >= 'A' and i <= 'Z':
// #         result += chr(ord(i) + 32)
// #     if i >= 'a' and i <= 'z':
// #         result += chr(ord(i) - 32)

// # print(result)        

// # Java

// import java.util.Scanner;

// class nominal_case_changing 
// {
//     public static void main(String args[]) 
//     {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the string:");
//         String input_str = s.nextLine();
//         String result = "";

//         // char arr[] = input_str.toCharArray();

//         for(int i=0;i<input_str.length();i++) 
//         {
//             char s1 = input_str.charAt(i);
//             if(s1 >= 'a' && s1 <= 'z')
//             {
//                 s1 = (char)(s1 - 32);
//                 result += s1;
//             }
//             else if(s1 >= 'A' && s1 <= 'Z')
//             {
//                 s1 = (char)(s1 + 32);
//                 result += s1;
//             }
//             // if (arr[i] >= 'a' && arr[i] <= 'z')
//             // {
//             //     arr[i] = (char)(arr[i] - 32);
//             // }
//             // else if(arr[i] >= 'A' && arr[i] <= 'Z')
//             // {
//             //     arr[i] = (char)(arr[i] + 32);
//             // }
//         }

//         // String result = new String(arr);
//         System.out.println("The updated string is :" + result);
//     }
// }


     