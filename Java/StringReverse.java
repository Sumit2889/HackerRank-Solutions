import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder word = new StringBuilder(A);
        System.out.println(A.equals(word.reverse().toString())? "Yes" : "No");

    }
}



