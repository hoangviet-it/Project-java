
package th_java.cautruclap;

import java.util.Scanner;

public class bai17_buoi4 {
    static int thuasoA[] = new int[10];
    static int thuasoB[] = new int[10];
    static int dem;
    static int[] thuaso(int num){
        int[] thuaso = new int[10];
        int i=2;
        dem=-1;
        while(i<=num){
            if(num%i==0){
                dem++;
                thuaso[dem]=i;
                while((num%i==0)){
                    thuasoB[dem]++;
                    num/=i;
                }
            }
            i++;
        }
        return thuaso;
    }
    
    static void xuatthuaso(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    
    static boolean isNTCN(int[] a,int[] b){
        for(int i=0; i<a.length; i++)
            for(int j=0; j<b.length; j++)
                if((a[i]!=0)&&(b[j]!=0)&&(a[i])==(b[j]))
                    return false;
        return true;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập 2 số a và b: \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        thuasoA = thuaso(a);
        thuasoB = thuaso(b);
        xuatthuaso(thuasoA);
        xuatthuaso(thuasoB);
        boolean ok=isNTCN(thuasoA, thuasoB);
        if(ok==true)
             System.out.println(a+" va "+b+" là NTCN");
        else
            System.out.println(a+" va "+b+" không là NTCN");
    }
}
