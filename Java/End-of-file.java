import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true){
            if(sc.hasNext()){
                i++;
                String l = sc.nextLine();
                System.out.println(i + " " + l);
            }
            else{
                break;
            }    

        }
        
    }
}
