
package bai_kiem_tra;
import java.util.*;


public class cau_c {
    
    boolean ktsonguyento(int n){        
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    void daysont(int n, int m){
        int dem=0;
        for (int i = n; i <= m; i+=2) {
            if (ktsonguyento(i)) {
                dem++;               
            }
        }
        System.out.println("có "+dem+ " số nguyên tố là: ");
        for (int i = n; i <=m; i+=2) {
            if (ktsonguyento(i)) {               
                System.out.print(" " + i);
            }
        }
      System.out.print("\n");  
    }
    
    
    
    public static void main(String[] args){     // xuất các số nguyên tố nhỏ hơn n
        cau_c ham = new cau_c();
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("nhập N: ");
        n=sc.nextInt();
        System.out.print("nhập M: ");
        m=sc.nextInt();
        
        ham.daysont(n,m);

    }

    void daysont() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
