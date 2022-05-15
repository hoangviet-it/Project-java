
package th_java;
import java.util.*;

public class bai01_buoi2 {                            
    void nhap(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // nhập số phần tử mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int m;
        m = sc.nextInt();
        
        //khai báo mảng
        int[] a = new int[m];
        
        //nhập giá trị cho mảng
        for(int k=0; k<a.length;k++){
          
            System.out.print("Nhập giá trị thứ "+(k+1)+": ");
            a[k]=sc.nextInt();
        }
        
        System.out.print("Mảng vừa nhập là: ");
        //xuất mảng bình thường
//       for(int i=0; i<a.length; i++){
//           System.out.print(a[i]+" ");
//       }

        // xuất mảng dùng for each
        for(int n:a){
            System.out.print(n+" ");
        }
        
        //tổng mảng
        int tong=0;
        for(int j=0; j<a.length; j++){
            tong+=a[j];  
        }
        System.out.print("\n");
        System.out.println("Tổng mảng là: "+tong);
    }
}