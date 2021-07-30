import java.util.*;
public class javahw4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int a;
        boolean one =true;
        System.out.println("정수를 더합니다.(0 입력시 종료)");
        System.out.print("몇개를 더할까요? ");
        n = sc.nextInt(); 
        
        while(one){
           System.out.print("정수: ");
           a = sc.nextInt();
           

           if(a!=0){
             
            
                 sum += a;
                 
             }
           
             

               
           
           else{
               one = false;}
           
           
          
        
       
        System.out.println("정수의 합은 " +sum);
        System.out.println("정수의 평균은 "+(sum/n));
    
        
    }
}   
}
