import java.util.*;


public class javahw7_1{
public static void main(String[] args) {
    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("해당 월의 영어단어 입력");
    System.out.println("첫 글자는 대문자 나머지는 소문자");
    int a = ran.nextInt(12)+1;
    String m[] = {"January","Febuary","March","April","May",
    "June","July","August","Setember","October","November","December"};
    
    
    int c;
    while(true){
        System.out.print(a+"월: ");
        String s = sc.next();
    if(s.equals(m[a-1])){
    System.out.println("정답...1을 입력하면 다시합니다");
    c= sc.nextInt();
    if(c==1){
        continue;
    }
    
    }
     else    System.out.println("틀렸습니다.");
    break;
    
   
        }
   

    
}
}
