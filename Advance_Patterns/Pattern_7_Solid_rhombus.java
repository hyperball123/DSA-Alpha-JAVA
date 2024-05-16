package Advance_Patterns;

public class Pattern_7_Solid_rhombus {
    public static void main(String[] args) {
        solid_rhombus(5);
    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= (n-i) ; j++) {
                System.out.print("\t");
            }

            for(int j = 1; j <= n ; j++) {
                System.out.print("*\t");
            }
            System.out.println();

        }
    }
}