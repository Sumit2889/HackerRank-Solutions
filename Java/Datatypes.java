import java.util.Scanner;
import java.lang.Math;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            try{
                long num = sc.nextLong();
                System.out.println(num + " can be fitted in:");

                if(num >= -128 && num <= 127)
                    System.out.println("* byte");
                
                if(num >= -32768 && num <= 32767)
                    System.out.println("* short");

                if(num >= Math.pow(-2, 31) && num <= (Math.pow(2, 31) - 1))
                    System.out.println("* int");

                if(num >= Math.pow(-2, 63) && num <= (Math.pow(2, 63) - 1))
                    System.out.println("* long");
            }
            catch(Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
            
        }
    }
}
