
package th_java;
import java.util.*;

public class bai02 {                            //hập 3 giá trị, tìm min và max
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, min, max;
        
        System.out.println("nhập a: ");
        a=sc.nextInt();    
        System.out.println("nhập b: ");
        b=sc.nextInt();     
        System.out.println("nhập c: ");
        c=sc.nextInt(); 
        
        max=a;
        min=c;
        
        if((b>max)&&(c>max)){       // tìm max
            if(c>b){
                max=c;
            }
            else max=b;           
        }
        else if((b>max)&&(c<max)){
            max=b;
        }
        else if((b<max)&&(c>max)){
            max=c;
        }
        
        
        if((b<min)&&(a<min)){       //tìm min
            if(a<b){
                min=a;
            }
            else min=b;           
        }
        else if((b<min)&&(a>min)){
            min=b;
        }
        else if((b>min)&&(a<min)){
            min=a;
        }
        
        System.out.println("3 giá trị vừa nhập là: " + a +", "+ b +", "+ c);
        System.out.println("max là: "+max);
        System.out.println("min là: "+min);
    }
}