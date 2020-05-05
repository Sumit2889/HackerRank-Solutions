import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int start_index = sc.nextInt();
        int end_index = sc.nextInt();

        System.out.println(str.substring(start_index, end_index));
    }
}
