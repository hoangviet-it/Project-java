
package th_java.cautruclap;

import java.util.*;


public class bai12_buoi3 {
    
    long giaithua(int n){
        long tich= 1;
        for(long i=2; i<=n; i++){
            tich*=i;
        }
        return tich;
    }
    public static void main(String[] args){     // tính n giai thừa
        bai12_buoi3 ham = new bai12_buoi3();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhập n: ");
        n=sc.nextInt();
        
        long kq= ham.giaithua(n);
        System.out.println(n+"!= "+kq);
    }
 
}
