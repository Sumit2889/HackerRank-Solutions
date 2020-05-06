import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        int str_len = s.trim().length();
        if(str_len == 0)
            System.out.println(0);

        else if(str_len <= 400000){
        // Write your code here.
            String[] s_array = s.trim().split("[!, ?._'@]+");
            System.out.println(s_array.length);

            for(String i : s_array)
                System.out.println(i);    
        }
    }
}

