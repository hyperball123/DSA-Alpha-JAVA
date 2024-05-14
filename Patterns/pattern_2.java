package Patterns;

public class pattern_2 {
    public static void main(String[] args) {

        for(int i = 1; i <= 6 ; i++){
            for (int star=6 ;  star >= i ; star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
