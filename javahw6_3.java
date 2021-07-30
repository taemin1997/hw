import java.util.*;

public class javahw6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("요소수 : ");
        int i =sc.nextInt();
        int a[] = new int[i];
        a[0] = ran.nextInt(10)+1;
        for(int j = 0;j<i;j++){
            a[j] = ran.nextInt(10)+1;
            
            if(a[i+1]==a[j]){
                break;
            }
        }
        for(int n=0;n<i;n++){
            System.out.println(a[n]);
        }









    }
    
}
