
package th_java.cautruclap;
import java.util.*;

public class bai02_buoi2 {      
    
//    int Boi3(int n, int m)
//    {
//        int BoiSo3=0;
//        for(int i=n; i<=m; i++){
//            if(i%3==0 && i>0){
//                BoiSo3=i;
//                
//            }
//        }
//        return  BoiSo3;  
//    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        bai02_buoi2 ham= new bai02_buoi2();
        
        int n,m;
        
        System.out.print("nhập n: ");
        n=sc.nextInt();
        System.out.print("nhập m: ");
        m=sc.nextInt();
         
        //bội của 3
        System.out.print("bội số của 3: ");
        for(int i=n; i<=m; i++){
            if(i%3==0 && i>0){
               System.out.print(i+" ");
            }
        }

        System.out.print("\n");
         
        //bội của 2
        System.out.print("bội số của 2: ");
        for(int j=n; j<=m; j++){
               if(j%2==0 || j==0){
               System.out.print(j+" ");
            }
        } 
        
        System.out.print("\n");
         
        //bội của 2 và 3
        System.out.print("bội số của 2 và 3: ");
        for(int j=n; j<=m; j++){
               if((j%2==0 || j==0) || (j%3==0 && j>0)){
               System.out.print(j+" ");
            }
        } 
    }
}

