import java.sql.Blob;
import java.util.Scanner;

public class javahw7_5 {
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("최소값 구하기: ");
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
System.out.println("최소값은: "+Min.min(a,b,c));





}

  
    



}


class Min{
    static int min(int a, int b, int c){
      int x = a;
      if(b<x) x=b;
      if(c<x) x=c;
      return x;

    }
}