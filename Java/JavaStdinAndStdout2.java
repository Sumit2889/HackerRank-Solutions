import java.util.Scanner;

public class sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        double second = sc.nextDouble();
        sc.nextLine();
        String third = sc.nextLine();

        System.out.println("String: " + third + "\n" + "Double: " + second + "\n" + "Int: " + first);
    }
}
