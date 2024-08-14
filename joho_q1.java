import java.util.*;

class joho_q1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int temp = n;

        int sum = 0;
        
        while(temp > 0) {
            
            int rem = temp % 10;
            int fact = 1;
            for(int i=1;i<=rem;i++) {
                  fact = fact * i;            
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        System.out.println(sum);
        if(n == sum) {
            System.out.println(n + " is true");
        }
        else {
            System.out.println(n + "is false");
        }

    }
}