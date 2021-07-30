import java.util.*;
public class javahw5_1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자맞추기 게임");
        System.out.println("0부터 99사이의 숫자 맞추기");
        int a;
        for(int i = 6;i>0;i--){
            System.out.print("남은 횟수 "+ i +"회, 어떤 숫자일까? ");
            a = sc.nextInt();
            if(a<x){
                System.out.println("더 큰 숫자입니다");
                continue;
            }else if(a>x){
                System.out.println("더 작은 숫자입니다.");
                continue;
            }else if(a==x){
                System.out.println("정답입니다. "+(7-i)+"번 만에 맞췄습니다");
                break;
            
              } 
            else{
                System.out.println("틀렸습니다.");
                System.out.println("아쉽지만 정답은 "+x+"입니다.");
            }
            
                
                
            
            }
            
        }
    
        
    }
