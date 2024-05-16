package Advance_Patterns;

public class Pattern_6_Butterfly {
    public static void main(String[] args) {
        butterfly(4);
    }

    public static void butterfly(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= i ; j++){
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2*(n-i) ; j++){
                System.out.print("\t");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
//            2nd half
        for(int i = n ; i >= 1 ; i--){
            for (int j = 1; j <= i ; j++){
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2*(n-i) ; j++){
                System.out.print("\t");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

}
