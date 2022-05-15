
package th_java.cautruclap;

import java.util.Scanner;


public class bai18_buoi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thapphan;
        String s;
        System.out.print("nhập số cần đổi: ");
        thapphan = sc.nextInt();
        System.out.println("Giá trị nhị phân của "+thapphan+" là: ");
        
        s=Integer.toBinaryString(thapphan);
       // System.out.println(Integer.toBinaryString(thapphan));
       
        int size = s.length();
        //System.out.println(size);
        
        
        if((size<8)&&(size>6)){
            System.out.println("0"+s);
        }
        else if((size<8)&&(size==6)){
            System.out.println("00"+s);
        }
        else if((size<8)&&(size==5)){
            System.out.println("000"+s);
        }
         else if((size<8)&&(size==4)){
            System.out.println("0000"+s);
        }
         else if((size<8)&&(size==3)){
            System.out.println("00000"+s);
        }
         else if((size<8)&&(size==2)){
            System.out.println("000000"+s);
        }
         else if((size<8)&&(size==1)){
            System.out.println("0000000"+s);
        } 
        else if((size==8)){
            System.out.println(s);
        } 

    }
}
