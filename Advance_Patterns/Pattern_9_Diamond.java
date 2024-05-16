package Advance_Patterns;

public class Pattern_9_Diamond {
    public static void main(String[] args) {
        Hollow_rhombus(7);
    }

    public static void Hollow_rhombus(int n) {
        for(int i = 1  ; i <= n ; i++){
            for(int j = 1; j <= (n-i) ; j++) {
                System.out.print("\t");
            }

            for(int j = 1; j<=(2*i)-1 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        for(int i = n  ; i >= 1 ; i--){
            for(int j = 1; j <= (n-i) ; j++) {
                System.out.print("\t");
            }

            for(int j = 1; j<=(2*i)-1 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}