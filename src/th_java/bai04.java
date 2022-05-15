
package th_java;
import java.util.*;

public class bai04 {   
    

    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        
        System.out.print("nhập số thứ 1: ");
        a = sc.nextInt();
        System.out.print("nhập số thứ 2: ");
        b = sc.nextInt();
        System.out.print("nhập số thứ 3: ");
        c = sc.nextInt();
        System.out.print("nhập số thứ 4 ");
        d = sc.nextInt();
        
        
        if(a>b)
            {
              a=a+b;
                b=a-b;
                a=a-b;
            }
        if(a>c)
            {
              a=a+c;
                c=a-c;
                a=a-c;
            }
        if(a>d)
            {
              a=a+d;
                d=a-d;
                a=a-d;
            }
        
         if(b>c)
            {
              b=b+c;
                c=b-c;
                b=b-c;
            }
         if(b>d)
            {
              b=b+d;
                d=b-d;
                b=b-d;
            }
         
         if(c>d)
            {
              c=c+d;
                d=c-d;
                c=c-d ;
            }
    System.out.println("Dãy số tăng dần là: "+a+" -> "+b+" -> "+c+" -> "+d);
//    getch();


//        if((b<a)&&(c<a)&&(d<a))
//        {
//            if((c<b)&&(d<b)){
//                if(d<c){
//                    System.out.println(d +" "+c+" "+b+" "+a);
//                }
//                else System.out.println(c +" "+d+" "+b+" "+a);
//            }
//            else if((c>b)&&(d>b)){
//                if(d>c){
//                    System.out.println(b +" "+c+" "+d+" "+a);
//                }
//                else System.out.println(b +" "+d+" "+c+" "+a);
//            }
//            else if((c<b)&&(d>b)){
//                if(d>c){
//                    System.out.println(c +" "+b+" "+d+" "+a);
//                }                
//            }
//            else if((c>b)&&(d<b)){
//                if(d<c){
//                    System.out.println(d +" "+b+" "+c+" "+a);
//                }
//                
//            }
//        }
//        
//        else if((a<b)&&(c<b)&&(d<b)){
//            if((c<a)&&(d<a)){
//                if(d<c){
//                    System.out.println(d +" "+c+" "+a+" "+b);
//                }
//                else System.out.println(c +" "+d+" "+a+" "+b);
//            }
//            else if((c>a)&&(d>a)){
//                if(d>c){
//                    System.out.println(b +" "+c+" "+d+" "+b);
//                }
//                else System.out.println(b +" "+d+" "+c+" "+b);
//            }
//            else if((c<b)&&(d>b)){
//                if(d>c){
//                    System.out.println(c +" "+b+" "+d+" "+a);
//                }                
//            }
//            else if((c>b)&&(d<b)){
//                if(d<c){
//                    System.out.println(d +" "+b+" "+c+" "+a);
//                }
//                
//            }
//        }
    }
        
}
