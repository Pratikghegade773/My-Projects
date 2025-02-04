// public class Palindrome {
//     public static void main(String[] args) {
//         String str = "madam";
//         String reversed = new StringBuilder(str).reverse().toString();
//         System.out.println(str.equals(reversed));
//     }
// }


import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String OriginalString = sc.nextLine();

        OriginalString = OriginalString.replaceAll(OriginalString, OriginalString).toLowerCase();
        String ReversedString = " ";

        for(int i=OriginalString.length()-1;i>=0;i--)
        {
            ReversedString+= OriginalString.charAt(i);
        }
        if (OriginalString.equals(ReversedString)) {
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("The String is not Palindrome");
        }
    }
}