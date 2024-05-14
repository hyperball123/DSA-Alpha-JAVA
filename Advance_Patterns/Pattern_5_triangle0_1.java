package Advance_Patterns;

public class Pattern_5_triangle0_1 {
    public static void main(String[] args) {
        int n = 5;

        for(int r = 1; r <= n ; r++){
            for(int c = 1; c <= r ; c++){
                if((r + c) % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
