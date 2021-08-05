import java.util.Scanner;
public class javahw7_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 부호 판정:");
        int a = sc.nextInt();
        
      System.out.println(Signof.signOf(a));

    }



}

class Signof{
  static int signOf(int a){
        int sign = 0;
        if(a>0)
            sign = 1;
        
        else if(a<0)
            sign = -1;
        
        return sign;
    }
}
