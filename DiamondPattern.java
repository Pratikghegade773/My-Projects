public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int stars = 2 * i-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int stars = 2 * i-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
