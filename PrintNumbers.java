// public class PrintNumbers{
//     public static void printNum(int n){

//         if(n == 0){
//             return; 
//         }
        
//         System.out.println(n);
//         printNum(n-1);
//     }
//     public static void main (String args []){
//         int n = 5;  //5 to 1
//         printNum(n);

//     }
// }


public class PrintNumbers{
    public static void printNum(int n){

        if(n == 6){
            return; 
        }

        System.out.println(n);
        printNum(n+1);

    }
    public static void main (String args []){
        int n = 1;  //1 to 5
        printNum(n);

    }
}


