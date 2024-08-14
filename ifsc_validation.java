import java.util.Scanner;

class ifsc_validation {
    // public static void main(String args[]) {
    //     Scanner s = new Scanner(System.in);
    //     // Input the string from the user
    //     System.out.println("Enter the IFSC code:");
    //     String ifsc = s.nextLine();
        
    //     // Find the length of the string
    //     int len = ifsc.length();
        
    //     // System.out.println(len);
    //     // System.out.println(ifsc.substring(0,2));
    //     // System.out.println(ifsc.substring(2,4));

    //     if(len != 11) {
    //         System.out.println(ifsc + " is not valid");
    //     }
        
    //     else if(ifsc.substring(0,2).equals("SB") && ifsc.substring(2,4).equals("IN")){
    //         //  System.out.println(ifsc+" is valid");
    //             if(ifsc.substring(4,7).equals("000") && ifsc.substring(7,11).matches("\\d+")) {
    //                  System.out.println(ifsc + " is valid");
    //              }
            
    //         else {
    //             System.out.println(ifsc + " is not valid");
    //         }
    //     }   
  //  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the indian bank IFSC code:");
    String ifsc = s.nextLine();

    int len = ifsc.length();
    System.out.println(len);
    if(len != 11 || ifsc.charAt(4) != '0') {
        System.out.println(ifsc + " is not valid");
    }
    else if(ifsc.substring(0, 2).equals("ID") && ifsc.substring(2,4).equals("IB")) {
        if(ifsc.substring(5, 7).equals("00") && ifsc.substring(8,11).matches("\\d+")) {
            if(ifsc.charAt(7) == 'A') {
                System.out.println(ifsc+" belongs to AP");
            }
            else if(ifsc.charAt(7) == 'T') {
                System.out.println(ifsc + " belongs to Tamil Nadu");
            }
        
        }
        else {
            System.out.println(ifsc + " is not valid");
        }
    }
  }
}
