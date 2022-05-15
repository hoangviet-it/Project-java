
package th_java.cautruclap;
import java.util.*;

public class bai15_buoi4 {              // phân tích 1 số nguyên thành tổng 2 số nguyên tố
    static boolean kt_snt(int n){
        int tam=(int)Math.sqrt(n);
        for(int i=2; i<=tam; i++)
            if(n%i==0)
                return false;
        return true;
    }
    
    static void xuly(int n){
        int tam=(int)Math.sqrt(n);
        for(int i=2; i<=tam; i++)
            if(kt_snt(i)&&(kt_snt(n-i))){
                System.out.println(n+" phân tích thành "+i+" + "+(n-i));
            }
                
    }
    public static void main(String[] args) {
        int n=53;
        xuly(n);
        
    }
}
