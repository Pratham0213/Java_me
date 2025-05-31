package test_Projet;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 29; // Replace with the number you want to check
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}