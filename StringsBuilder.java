public class StringsBuilder {
    public static void main(String[] args) {
        
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // //charAt
        // System.out.println(sb.charAt(0));

        // //Set charAt index 0
        // sb.setCharAt(0,'G');
        // sb.setCharAt(0,'T');
        // System.out.println(sb);

        // //Insert character
        // sb.insert(2,'n');
        // System.out.println(sb);

        // sb.insert(0,'S');
        // System.out.println(sb);

        // //Delete the extra character
        // sb.delete(0,1);
        // sb.delete(3,4);
        // System.out.println(sb);
        // System.out.println(sb.length());



        //Reverse a string by StringBuilder
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);


        }
        System.out.println(sb);



    }
}
