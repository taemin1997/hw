import java.util.*;


public class javahw4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("2 이상의 정수값: ");
        a = sc.nextInt();
        
       
       
        int i;
        for(i = 2;i<=a;i++)
        if(a % i==0)
        break;
        if(a==i){
            System.out.println("소수");
        }
        else{
            System.out.println("소수 아님");
           
        }


            
        

        



                
            }

            

        

        
    }
    

