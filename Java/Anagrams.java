import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b){
        if(a.length() == b.length()){
            String[] str1 = a.split("");
            String[] str2 = b.split("");

            java.util.Arrays.sort(str1, String::compareToIgnoreCase);
            java.util.Arrays.sort(str2, String::compareToIgnoreCase);
        
            for(int i = 0; i < str1.length; i++){
                if(str1[i].compareToIgnoreCase(str2[i]) != 0)
                    return false;
            }
            return true;
        }
        else 
            return false;
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
