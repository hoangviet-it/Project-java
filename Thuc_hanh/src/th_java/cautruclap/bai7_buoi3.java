
package th_java.cautruclap;
import java.util.*;

public class bai7_buoi3 {      
    
    
    public static void main(String[] args){     // tìm số hoàn chỉnh
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("nhập n: ");
        n=sc.nextInt();
        
        int tong=0;
        for(int i=1;i<=n/2;i++){    //tổng các ước số của n
            if(n%i==0) 
              tong+=i;
        }
        
        if(tong==n){
            System.out.println(n + " là số hoàn chỉnh");
        }
        else {
            System.out.println(n + " không phải là số hoàn chỉnh");
        }
    }
}

