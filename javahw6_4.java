import java.util.*;
public class javahw6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("요소 수: ");
        int n = sc.nextInt();
        int a[] = new int[n];
       
        for(int i = 0 ; i<n;i++){
            System.out.print("a["+i+"] =");
            a[i]= sc.nextInt();
            
        }
        for(int j =0;j<2*n;j++){
            int jdx1 = ran.nextInt(n);
            int jdx2 = ran.nextInt(n);
            int t = a[jdx1];
            a[jdx2] = t;

        }

        System.out.println("요소를 섞음");
        for(int k=0;k<n;k++){
            System.out.println("a["+k+"]= "+a[k]);
        }

        
      
    }
    
}
