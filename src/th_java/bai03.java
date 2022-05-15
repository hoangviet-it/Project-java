
package th_java;
import java.util.*;

public class bai03 {                            
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int thang,nam;
        System.out.print("nhập năm: ");
        nam=sc.nextInt();
        System.out.print("nhập tháng: ");
        thang=sc.nextInt();
        
        if((thang>12)||(thang<1)){                                  // ràng buộc tháng <12 và >1
            System.out.println("tháng "+thang+" không hợp lệ");
        }
        
        if((thang==1)||(thang==3)||(thang==5)||(thang==7)||(thang==8)||(thang==10)||(thang==12)){
            
            System.out.println("Tháng "+thang+" có: "+"31 ngày");
        }
        else if((thang==4)||(thang==6)||(thang==9)||(thang==11)){
            
            System.out.println("Tháng "+thang+" có: "+"30 ngày");
        }
        else if(thang==2) {    // năm nhuận
            
            if((nam%400==0)||((nam%4==0)&&(nam%100!=0))){                   //nam%100!=0 : loại trừ các anwm đầu thế kỷ
                System.out.println(nam+" là"+" Năm nhuận");
                System.out.println("Tháng "+thang+" có: "+"29 ngày");     //   
            }
            else System.out.println("Tháng "+thang+" có: "+"28 ngày");
        }
        
    }
}