
package mang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class bai4_buoi6 {
    int n;
    int arr[];
    Random rd = new Random();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sô phần tử lượng : ");
        n = sc.nextInt();
        arr = new int [n];
        double rd = Math.random();
        rd = rd * 10;
        int a = (int)rd;
        for(int i=0;i<n;i++){
           arr[i] = a;
           rd = Math.random();
           rd = rd * 10;
           a = (int)rd;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        
        System.out.println("Nhập số cần chèn vào");
        int k = sc.nextInt();
        int b[] = new int [n+1];
        int c = 0;
        boolean inserted = false;
            for(int i=0;i<n+1;i++){
                b[i] = arr[c];
                if(k<arr[c] && inserted == false){
                    b[i] = k;
                    inserted = true;
                }
                else
                 c++;
                if(c == n)
                    c--;
        }
        if(inserted == false )
            b[n] = k;
             for(int i=0;i<n+1;i++){
                System.out.print(b[i]+" ");
        }
        
       
    }
    public static void main(String[] args) {
        bai4_buoi6 ham =new bai4_buoi6();
        ham.nhap();
    }    
}
