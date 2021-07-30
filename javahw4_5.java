import java.util.*;
public class javahw4_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        System.out.print("몇개를 더 할까요? ");
        int n = sc.nextInt();
        int sum = 0;
        int a;
        
        for(a = 0; a<n; a++){
            System.out.print("정수: ");
            int x = sc.nextInt();
            if(x<0){
                System.out.println("음수는 제외");
                continue;
            }
           sum += x;


            
            }
           


            

        
        
        System.out.println(sum);
        System.out.println(sum/n);
    }
    
}
