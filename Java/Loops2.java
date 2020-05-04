import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int result = 0;
            
            for(int j = 0; j < n; j++){
                if(j == 0)
                    result = a;
                int num = (int)Math.pow(2, j);
                result = result + num * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
