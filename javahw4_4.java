import java.util.*;

public class javahw4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("정수를 더합니다");
        System.out.print("몇개를 더할까요? ");
        n = sc.nextInt();
        int sum = 0;
        int a;
        for(a=0;a<n;a++){
            System.out.print("정수: ");
            int x = sc.nextInt();
         
           if(sum+x>1000){
               System.out.println("1000넘김");
              
               break;
               
           }
           sum+=x;
           if(x==0){
               System.out.println("입력 종료");
               break;
           }
          
            
           
           
           
        }
        
        
     System.out.println("합계는 "+ sum+ "평균은 " + (sum/n)+"입니다.");
     

        





    }
    
}
