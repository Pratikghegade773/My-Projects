// public class SelectionSort {
    
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};

//         for(int i=0;i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest=j;
//                 }
//             }
//             //swap
//             int swap = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = swap;

//         }
//         printArray(arr);
//     }
// }


public class SelectionSort{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        for(int i=0; i<arr.length-1; i++){
            int smallest= i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            //swap
            int swap = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = swap;
        }
        printArray(arr);
    }
}
