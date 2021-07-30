
import java.util.*;
public class javahw6_2{
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수: ");
        int i = sc.nextInt();
        int a[] = new int[i];
        a[0] =ran.nextInt(i)+1;
        for(int j= 1;j<i;j++){
            do{
                a[j] = ran.nextInt(10)+1;
            }while(a[j]==a[j-1]);
            
        }
        for(int x=0;x<i;x++){
            System.out.println("a["+x+"] = "+ a[x]);
        }
        
        
    }
}