import java.util.Scanner;

class primes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();

        int primes[] = new int[n];
        int primecount = 0;

        for(int i=0;i<n;i++) {
            if(isprime(i)) {
                primes[primecount] = i;
                primecount++;
            }
            
        }

        // // int max = primes[0];
        // // for(int i=0;i<primecount;i++) {
        // //     System.out.print(primes[i] + " ");
        // //     if( primes[i] > max) {
        // //         max = primes[i];
        // //     }

        // }
        System.out.println("The maximum prime number below " + n + " is " + primes[primecount-1]);

    }
    public static boolean isprime(int n) {
        if(n <= 1) {
            return false;
        }
        else {
            for(int i=2;i<=n/2;i++) {
                if(n % i == 0)
                  return false;
            }
        }
        return true;
    }
}