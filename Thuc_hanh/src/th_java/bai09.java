
package th_java;
import java.util.*;

public class bai09 {      
    
    String Sapngua(int a){
        if(a == 0)
            return "Sấp";
        else
            return "Ngữa";
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        bai09 ham = new bai09();
        
        //tung đồng xu: mặt ngửa:0, mặt sắp:1
        int A= ((int)(Math.random()*10)) % 2;
        int B= ((int)(Math.random()*10)) % 2;
        int C= ((int)(Math.random()*10)) % 2;
        
        System.out.println("A= "+ham.Sapngua(A)+" B= "+ham.Sapngua(B)+" C= "+ham.Sapngua(C));
        
        
        //kiểm tra và kết luận
        if((A==B)&&(B==C)){
            System.out.println("cả 3 bạn hòa nhau");
        }
        else if((A==B)&&(B!=C)){
            System.out.println("bạn C thắng");
        }
        else if((A==C)&&(C!=B)){
             System.out.println("bạn B thắng");
        }
        else if((B==C)&&(C!=A)){
             System.out.println("bạn A thắng");
        }
    }
}
