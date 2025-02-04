// public class PrimeNumberCheck {
//     public static void main(String[] args) {
//         int number= 11;
//         boolean is prime=true;
//         for(int i=2;i<=Math.sqrt(number);i++){
//             if(number%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         System.out.println(isPrime);
//     }
}



import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;
            
           
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
