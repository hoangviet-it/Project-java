
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class sinhvien{
     String ten;
     int tuoi;
     float diemtk;
    
    // hàm nhập
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sinh viên: ");
        ten=sc.nextLine();
        System.out.println("nhập tuổi sinh viên: ");
        tuoi=sc.nextInt();
        System.out.println("nhập điểm tổng kết của sinh viên: ");
        diemtk=sc.nextFloat();
    }
    
    void xuat(){
        System.out.println("tên sinh viên: "+ten);
        System.out.println("tuổi sinh viên: "+tuoi);
        System.out.println("điểm tổng kết: "+diemtk);
    }
    
    void sua(){
        Scanner sc = new Scanner(System.in);
        String tam="";
        System.out.println("Sửa thông tin sinh viên: ");
        System.out.println("Sửa tên (nhấn enter để bỏ qua): ");
        tam=sc.nextLine();
        if(!tam.equals(""))
            ten=tam;
            
        System.out.println("Sửa tuổi (nhấn enter để bỏ qua): ");
        tam=sc.nextLine();
        if(!tam.equals(""))
            tuoi=Integer.parseInt(tam);
            
        System.out.println("Sửa điểm (nhấn enter để bỏ qua): ");
        tam=sc.nextLine();
        if(!tam.equals(""))
            diemtk=Float.parseFloat(tam);
    }
    
//    public void timtheoten(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap tên SV cần tìm : ");
//        String ten = sc.nextLine();
//         for(sinhvien a : dssv){
//           if(a.getName().matches(ten)){    //thể đổi matches thành contains nếu muốn tìm theo kiểu vài tử đầu tiên
//               a.xuat();
//               break;
//           }
//        }     
//    }
}

public class quanlysinhvien {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhvien> dssv = new ArrayList<>();
        
        //sv1.xuat();
        int n;
        System.out.print("NHẬP SỐ LƯỢNG SINH VIÊN: ");
        n=sc.nextInt();
        
        // nhập thông tin sinh viên
        for(int i=0;i<n;i++){
            sinhvien sv1=new sinhvien();
            System.out.println("NHẬP THÔNG TIN SINH VIÊN "+(i+1)+": ");
            sv1.nhap();
            dssv.add(sv1);
            System.out.println();
        }
        
        //xuất thông tin sinh viên
         System.out.println();
         for(int i=0;i<n;i++){
            System.out.println("THÔNG TIN SINH VIÊN "+(i+1)+" GỒM: ");
            dssv.get(i).xuat();
            System.out.println();
         }
         System.out.println("số lượng sinh viên trong danh sách là: "+ dssv.size());
         System.out.println();
         
        //sửa sinh viên đầu tiên
        sinhvien sv1 = dssv.get(0);
         sv1.xuat();
         sv1.sua();
         sv1.xuat();
         
         // xóa sinh viên trong danh sách
        System.out.println("NHẬP THỨ TỰ SINH VIÊN CẦN XÓA: ");
        int x = sc.nextInt();
        dssv.remove(x-1);
        System.out.println("số lượng sinh viên trong danh sách còn lại là: "+ dssv.size());
         
         for(int i=0;i<dssv.size();i++){
            System.out.println("THÔNG TIN SINH VIÊN "+(i+1)+" GỒM: ");
            dssv.get(i).xuat();
            System.out.println();
         }
         
         //tìm kiếm
//        System.out.print("Nhap tên SV cần tìm : ");
//        String ten = sc.nextLine();
//         for(sinhvien a : dssv){
//           if(a.getName().matches(ten)){    //thể đổi matches thành contains nếu muốn tìm theo kiểu vài tử đầu tiên
//               a.xuat();
//               break;
//           }
//        }     
    }
    
}
