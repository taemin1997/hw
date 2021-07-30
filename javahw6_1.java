import java.util.*;

public class javahw6_1{
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("요소 수: ");
        i = sc.nextInt();
        int a[] = new int[i];
        for(int j=0;j<i;j++){
            a[j] = ran.nextInt(100);
            System.out.println("a["+j+"] = "+a[j]);
           
            }
            System.out.print("찾을 숫자: ");
            int x = sc.nextInt();
            if(a[i-1]==x){
                System.out.println("그 값은 a["+(i-1)+"]에 있습니다.");
           
        }
      
        
    }
}