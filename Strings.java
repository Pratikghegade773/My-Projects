// import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is: "+ name);

        
        // //Concatenation
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + lastName;
        // System.out.println(fullName);

        // //String Length
        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }


        //Compare
        // String name1 = "Tony";
        // String name2 = "Tonystar";

        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // } else{
        //     System.out.println("Strings are not equal");
        // }


        //Substring
        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }

}
