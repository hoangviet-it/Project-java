
package th_java.cautruclap;

import java.util.*;

public class bai16_buoi4 {
    static boolean kt_snt(int n){
        int tam=(int)Math.sqrt(n);
        for(int i=2; i<=tam; i++)
            if(n%i==0)
                return false;
        return true;
    }
    static void xuly(int n){
        System.out.print("dãy số từ 0 đến nhỏ hơn "+n+" là: ");
        for(int j=0; j<n; j++){           
                System.out.print(j+" ");
        }
        System.out.print("\n");
        
        System.out.print("các số nguyên tố bé hơn "+n+" trong dãy số trên là: ");
        for(int i=1; i<n; i++){
            if(kt_snt(i)){
                System.out.print(i+" ");
            }
        }
         System.out.print("\n");
    }
    public static void main(String[] args) {
        int n=10;
        xuly(n);

    }
}
