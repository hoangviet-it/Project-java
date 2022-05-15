
package bai_kiem_tra;
import java.util.*;


public class cau_b {
    
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
    
    void daysont(int n,int vt){
        int dem=0,dem1=0;
        for (int i = 2; i <= n; i++) {
            if (ktsonguyento(i)) {
                dem++; 
            }
            if (dem==vt) {               
                System.out.print("số nguyên tố ở vị trí thứ "+dem+" là: " +(i));
                break;
            }
        }
      System.out.print("\n");  
    }
    
    
    
    public static void main(String[] args){     // xuất các số nguyên tố nhỏ hơn n
        cau_b ham = new cau_b();
        Scanner sc = new Scanner(System.in);
        int n,vt;
        System.out.print("nhập nhập giới hạn duyệt: ");
        n=sc.nextInt();
        System.out.print("nhập N: ");
        vt=sc.nextInt();
        
        ham.daysont(n,vt);

    }
    
}
