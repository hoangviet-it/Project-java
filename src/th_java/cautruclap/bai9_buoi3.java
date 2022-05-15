
package th_java.cautruclap;

import java.util.*;


public class bai9_buoi3 {
    
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
        if(ktsonguyento(n)){
            System.out.println(n + " là số nguyên tố");
        }
        else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
    
    public static void main(String[] args){     // kiểm tra n có phải số nguyên tố
        bai9_buoi3 ham = new bai9_buoi3();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhập n: ");
        n=sc.nextInt();
        
        ham.in(n);
    }

    
}
