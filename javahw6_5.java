import java.util.*;


public class javahw6_5 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소수: ");
    int i = sc.nextInt();
    int a[] = new int[i];
    int b[] = new int[i];
    for(int n = 0;n<i;n++){
        System.out.print("a["+n+"] = ");
        a[n] = sc.nextInt();
       }
    for(int n=0;n<i;n++){
        b[n] = a[i-n-1];
    }
    for(int n = 0;n<i;n++){
        System.out.println("b["+n+"] = "+b[n]);
    }








}
}