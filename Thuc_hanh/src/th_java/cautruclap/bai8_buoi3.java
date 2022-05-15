
package th_java.cautruclap;
import java.util.*;

public class bai8_buoi3 {      
    
    
    public static void main(String[] args){     // xuất các số hoàn chỉnh nhỏ hơn n
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("nhập n: ");
        n=sc.nextInt();
        int dem=0;
        for(int i = 1;i<n;i++)
        {   
            int tong=0;
            for(int j=1; j<i;j++){   
                
                if(i%j==0){         // tính tổng ước số              
                    tong+=j;                  
                }              
            }
            
            if(i==tong){   
                dem++;
            }          
        }  
        
        System.out.println("có "+dem+" số hoàn chỉnh là: ");
        for(int i = 1;i<n;i++)
        {   
            int tong=0;
            for(int j=1; j<i;j++){   
                
                if(i%j==0){                        
                    tong+=j;                  
                }              
            }
            
            if(i==tong){   
                dem++;               
                System.out.println(i);
            }
            
        }  
    }
}

