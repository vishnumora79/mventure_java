import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;



class pascal {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = s.nextInt();
        System.out.println(PascalTriangle(n));



    }
 
        public static  List<List<Integer>> PascalTriangle(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();
    
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                        row.add(val);
                    }
                }
                triangle.add(row);
            }
    
            return triangle;
        }
    }
    
