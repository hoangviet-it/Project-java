
package mang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class bai1_buoi6 {
    int n;
    int arr[];
    Random rd = new Random();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap sô phần tử lượng: ");
        n = sc.nextInt();
        arr = new int [n];
        double rd = Math.random();
        rd = rd * 100;
        int a = (int)rd;
        for(int i=0;i<n;i++){
            arr[i] = a;
            rd = Math.random();
            rd = rd * 100;
             a = (int)rd;        }
    }
    public void xuat(){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("\nSấp xếp mảng : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nxuất số nguyên đung một lần : ");
       int b = 0;
        for(int i=0;i<n-1;i++){
         
          if(arr[i] == arr[i+1])
               b++;
          else {
               if(i == n-1){
                System.out.print(arr[i]+" ");
               }
               if( b == 0)
               System.out.print(arr[i]+" ");
               else 
                b=0;
           }
        }
    }

    public static void main(String[] args) {
        bai1_buoi6 ham =new bai1_buoi6();
        ham.nhap();
        ham.xuat();
        
        
        
//       Scanner sc = new Scanner(System.in);
//        System.out.print("nhập số phần tử mảng: ");
//        int n = sc.nextInt();
//        int[] mang = new int[n];
//        
//        for(int i=0; i<mang.length; i++){
//            System.out.print("nhập phần tử thứ "+(i+1)+": ");
//            mang[i]=sc.nextInt();
//        }
//        System.out.println("mảng vừa nhập là: ");
//        for(int i=0; i<mang.length; i++){
//            System.out.print(mang[i]+" ");
//        }
//        System.out.println("\n");
//        for(int i=0; i<n; i++){
//            System.out.print(mang[i]+" ");
//        }
//        
    }
     
     
    
}
