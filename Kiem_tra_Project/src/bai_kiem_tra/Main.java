
package bai_kiem_tra;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bai_kiem_tra ham = new Bai_kiem_tra();
        int n;
        System.out.println("câu a. Viết hàm kiểm tra số N (N nhập từ bàn phím) có là số nguyên tố hay không?");
        System.out.print("nhập N: ");
        n=sc.nextInt();
        ham.in(n);
        System.out.print("\n");  

        cau_b ham1 = new cau_b();
        int n1,vt;
        System.out.println("câu b. Viết hàm xuất số nguyên tố thứ N (N nhập từ bàn phím; số nguyên tố thứ nhất là 2).");
        System.out.print("nhập nhập giới hạn duyệt: ");
        n1=sc.nextInt();
        System.out.print("nhập vị trí N cần xuất: ");
        vt=sc.nextInt();
        ham1.daysont(n1,vt);
        System.out.print("\n");  
        
        cau_c ham2 = new cau_c();
        int n2,m;
        System.out.println("câu c.Viết hàm xuất các số nguyên tố nằm giữa 2 số N và M (N, M nhập từ bàn phím).");
        System.out.print("nhập N: ");
        n2=sc.nextInt();
        System.out.print("nhập M: ");
        m=sc.nextInt();
        ham2.daysont(n2,m);
        
    }
}
