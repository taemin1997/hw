import java.util.*;
public class javahw4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
        System.out.print("단수는: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n; i++){
            for(int j = 1;j<=i;j++)
            System.out.print("*");
            System.out.println("");
        }

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
        System.out.print("단수: ");
        int a = sc.nextInt();
        for(int x = 1; x<=a; x++){
            for(int y = a; y>=x; y--)
            System.out.print("*");
            System.out.println("");
        }

        
    }
}