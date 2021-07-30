import java.util.*;
public class javahw6_2{
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("요소 수: ");
        i = sc.nextInt();
        int a[] = new int[i];
        for(int j=0;j<i;j++){
            a[j] = ran.nextInt(10);
            do{
            System.out.println("a["+j+"] = "+a[j]);
            }while(a[j]!=a[j]);
            }
        
    }
}