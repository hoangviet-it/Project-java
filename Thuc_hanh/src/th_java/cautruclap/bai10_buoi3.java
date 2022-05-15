
package th_java.cautruclap;

import java.util.*;


public class bai10_buoi3 {
    
//    void nhap(){
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("nhập n: ");
//        n=sc.nextInt();
//    }
    
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
    
    void in(int n){
        int dem=0;
        for (int i = 3; i < n; i+=2) {
            if (ktsonguyento(i)) {
                dem++;               
            }
        }
        System.out.println("có "+dem+ " số nguyên tố là: ");
        for (int i = 3; i < n; i+=2) {
            if (ktsonguyento(i)) {               
                System.out.print(" " + i);
            }
        }
      System.out.print("\n");  
    }
    
    public static void main(String[] args){     // xuất các số nguyên tố nhỏ hơn n
        bai10_buoi3 ham = new bai10_buoi3();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhập n: ");
        n=sc.nextInt();
        
        ham.in(n);
    }

    
}
