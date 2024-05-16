package Advance_Patterns;

public class Pattern_8_Hollow_rhombus {
    public static void main(String[] args) {
        Hollow_rhombus(5);
    }

    public static void Hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= (n-i) ; j++) {
                System.out.print("\t");
            }

            for(int j = 1; j <= n ; j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}