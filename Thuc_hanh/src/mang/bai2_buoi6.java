
package mang;       // liệt kê số lần xuất hiện của phần tử trong mảng

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class bai2_buoi6 {
    public static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();
        
        // khởi tạo arr
        int [] arr = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.printf("nhập phần tử thứ "+ (i+1)+": ");
            arr[i] = scanner.nextInt();
        }
         System.out.printf("mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        // tìm số lần xuất hiện của các phần tử
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            addElement(map, arr[i]);
        }

        for (Integer key : map.keySet()) {
            System.out.printf("số %d : %d lần.\n", key, map.get(key));
        }
    }
     
    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } 
        else {
            map.put(element, 1);
        }
    }
}

