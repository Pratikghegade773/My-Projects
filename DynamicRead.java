import java.util.Scanner;

public class DynamicRead {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a int value");
        int a= sc.nextInt();
        System.out.println("a value is:"+a);

        System.out.println("Enter b byte value");
        byte b= sc.nextByte();
        System.out.println("b value is:"+b);

        System.out.println("Enter c short value");
        short c= sc.nextShort();
        System.out.println("c value is:"+c);

        System.out.println("Enter d long value");
        long d= sc.nextLong();
        System.out.println("d value is:"+d);

        System.out.println("Enter e float value");
        float e= sc.nextFloat();
        System.out.println("e value is:"+e);

        System.out.println("Enter f double value");
        double f= sc.nextDouble();
        System.out.println("f value is:"+f);

        System.out.println("Enter g boolean value");
        boolean g= sc.nextBoolean();
        System.out.println("g value is:"+g);

        

        

    }
}