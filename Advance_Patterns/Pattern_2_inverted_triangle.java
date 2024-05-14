package Advance_Patterns;

public class Pattern_2_inverted_triangle {
    public static void main(String[] args) {
        int n = 6;

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int s = 1 ; s <= i ; s++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
