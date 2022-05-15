
package th_java.cautruclap;
import java.util.*;

public class bai01_buoi2 {      
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
         System.out.print("nhập n: ");
         n=sc.nextInt();
         System.out.print("nhập m: ");
         m=sc.nextInt();
         
         
         System.out.print("dòng chẵn: ");
         for(int i=n; i<=m; i++){
       
             if(i%2==0){
                System.out.print(i+" ");
             }      
         }
         
         System.out.print("\n");
         
         System.out.print("dòng lẽ: ");
         for(int i=n; i<=m; i++){
       
             if(i%2!=0){
                System.out.print(i+" ");
             }     
         }
         System.out.print("\n");
    }
}

