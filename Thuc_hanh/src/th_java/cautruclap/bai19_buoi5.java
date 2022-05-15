
package th_java.cautruclap;

import java.util.Scanner;


public class bai19_buoi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nhiphan;
        System.out.print("nhập số cần đổi: ");
        nhiphan = sc.nextLine();
        System.out.println("Giá trị thập phân của "+nhiphan+" là: ");
        System.out.println(Integer.parseInt(nhiphan,2));
    }
}
