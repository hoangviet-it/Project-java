
package th_java.cautruclap;
import java.util.*;

public class bai03_buoi2 {      
    
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
 
        if (n < 0) {
            return -1;
        } 
//        else if (n == 0 || n == 1) {
//            return n;
//        } 
        else {
            for (int i = 2; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
        }
        return c;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("nhập n: ");
        n=sc.nextInt();
        
        System.out.println("dãy số fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        
    }
}


