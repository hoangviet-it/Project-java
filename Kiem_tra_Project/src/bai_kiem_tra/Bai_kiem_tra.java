
package bai_kiem_tra;
import java.util.*;

public class Bai_kiem_tra {     // câu a. kiểm tra số nguyên tố
    
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
    
    public static void main(String[] args){     // kiểm tra N có phải số nguyên tố
        Bai_kiem_tra ham = new Bai_kiem_tra();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhập N: ");
        n=sc.nextInt();
        
        ham.in(n);
    }

}
