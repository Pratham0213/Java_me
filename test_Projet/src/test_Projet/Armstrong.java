package test_Projet;

import java.util.Scanner;

public class Armstrong {
    public static boolean isarmstrong(int n) {
        int length = String.valueOf(n).length();
        double sum = 0;
        int temp = n;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }
        
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        if (isarmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
