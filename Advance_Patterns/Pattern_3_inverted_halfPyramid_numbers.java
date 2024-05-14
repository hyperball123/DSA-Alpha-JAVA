package Advance_Patterns;

public class Pattern_3_inverted_halfPyramid_numbers {
    public static void main(String[] args) {
        int n = 7;

        for(int i = 1; i <= n ; i++){
            for(int num = 1 ; num <= n+1-i ; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
