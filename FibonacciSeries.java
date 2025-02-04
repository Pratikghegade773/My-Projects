public class FibonacciSeries {
    public static void main (String [] args){
        int n=10;
        int num1 = 0;
        int num2 = 1;
        System.out.print("FibonacciSeries: "+num1+","+num2);

        for(int i=2;i<n;i++){
            int num3= num1+num2;
            System.out.print(","+num3);
            num1=num2; 
            num2=num3;
        }
    }
}



// import java.util.Scanner;

// public class FibonacciSeries {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the number of terms in the Fibonacci series: ");
//         int terms = scanner.nextInt();
        
//         int first = 0, second = 1;

//         System.out.println("Fibonacci Series up to " + terms + " terms:");

//         for (int i = 1; i <= terms; i++) {
//             System.out.print(first + " ");
//             int next = first + second;
//             first = second;
//             second = next;
//         }

//         scanner.close();
//     }
// }

import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args) {
        int n=10;
        int num1=0;
        int num2=1;
        System.out.print("FibonacciSeries: "+num1+","+num2);
        for (int i = 2; i < n; i++) {
            int num3= num1+num2;
            System.out.print(","+num3);
            num1=num2;
            num2=num3;
            
        }
    }
}


public class FibonacciRecursive{
    public static void main(String[] args) {
        int n= 10;
        System.out.println("Fibonacci number at position"+n+"is:"+fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
