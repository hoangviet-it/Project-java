
package th_java.cautruclap;

public class bai14_buoi3 {
    static int so[] = new int[100];
    static int mu[] = new int[100];
    static int dem=-1;
    static int phantich(int num){
        int i=2;
        while(i<=num){
            if(num%i==0){
                dem++;
                so[dem]=i;
                while((num%i==0)){
                    mu[dem]++;
                    num/=i;
                }
            }
            i++;
        }
        return (dem+1);
    }
    
    static void xuat(int n, int dem){
        System.out.print(n+" = ");
        for(int i=0; i<dem; i++){
            System.out.print(so[i]+"^");
            System.out.print(mu[i]);
            
            if(i<dem-1){
            System.out.print(" * ");
            }
        }
        System.out.print("\n");
    }
        
    public static void main(String[] args){  
        int n=100;
        int dem=phantich(n);
        xuat(n,dem);
    }
}
