import java.util.Scanner;


public class javahw7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int [4][3]; 
        int[][] b = new int [3][4];
        int[][] c = new int [4][4];
        int n = 4;
        int k = 3;
        for(int i =0;i<n;i++){
            for(int j = 0;j<k;j++){
                
                System.out.printf("a[%d][%d]=",i,j);
                a[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<k;i++){
            for(int j = 0;j<n;j++){
                System.out.printf("b[%d][%d]= ",i,j);
                b[i][j] = sc.nextInt();
            }
        } for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                c[i][j] = 0;
            for(int x = 0;x<k;x++){
                c[i][j] += a[j][x]*b[x][j];
            }
            }
        }System.out.println("a와 b의 곱");
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.printf("%5d",c[i][j]);
                System.out.println();
            }
    }
    
}
}