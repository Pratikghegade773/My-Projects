import java.util.*;
public class Functions {

    // public static int calculateSum(int a,int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // public static int calculateProduct(int a, int b){
    //     return a*b;
    // }

    // public static void printFactorial(int n){
    //     if(n<0){
    //         System.out.println("Invalid Number");
    //         return;
    //     }
    //     int factorial= 1;
    //    for(int i=n; i>=1; i--){
    //         factorial= factorial * i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }

    // public static int printGreaterNumber(int a, int b){
    //    int number = 0;
    //     if(a>b){
    //         System.out.println(a);
    //     } else{
    //         System.out.println(b);
    //     }
    //     return number;

    // }

    public static double circumferenceOfCircle(double radius){
        return 2*Math.PI*radius;
    }
       


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);
        // System.out.println(sum);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(calculateProduct(a,b));

        //  int n = sc.nextInt(); 
         // printFactorial(n);

        //  int a = sc.nextInt();
        //  int b = sc.nextInt();
        //  printGreaterNumber(a, b);

        
        double radius = sc.nextDouble();

        double circumference = circumferenceOfCircle(radius);
        System.out.println(circumference);




         

    }
}