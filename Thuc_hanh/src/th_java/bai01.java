
package th_java;
import java.util.*;

public class bai01 {                            //dùng 2 biến nhập 4 số nguyên và tìm số lớn nhất
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, max;
        max=-2147483648;       // gán max = số nhỏ nhất của kiểu int
        
        for(int i=1; i<=4; i++){
            System.out.print("nhap so thu "+ i + ": ");
            num=sc.nextInt();
            
            if(num>max){
                max=num;
            }
        }
        System.out.println("max là: "+ max);
    }
}