import java.util.*;
import java.text.*;
import java.text.NumberFormat;

public class Solution {
    static String getCurrency(double number,Locale locale){
        NumberFormat obj = NumberFormat.getCurrencyInstance(locale);
        String currency = obj.format(number);
        return currency;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String us = getCurrency(payment, Locale.US);
        Locale obj = new Locale("en", "IN");
        String india = getCurrency(payment, obj);
        String china = getCurrency(payment, Locale.CHINA);
        String france = getCurrency(payment, Locale.FRANCE);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
