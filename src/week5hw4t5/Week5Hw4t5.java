package week5hw4t5;

import java.util.Scanner;

public class Week5Hw4t5 {
    public static void main(String[] args) {
        final int baseFee = 10;
        double total = 0;
        
        Scanner keyIn = new Scanner(System.in);
        
        System.out.println("How many checks have you written?");
        int checks = keyIn.nextInt();
        
        if ( checks < 20){
            total = baseFee + checks * 0.10;
        } else if ( checks > 20 && checks < 40){
            total = baseFee + checks * 0.08;
        } else if ( checks > 39 && checks < 60){
            total = baseFee + checks * 0.06;
        } else if ( checks >=60 ){
            total = baseFee + checks * 0.04;
        }
        System.out.println("Total is : $" + total);
        
    }
    
}
