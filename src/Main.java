import org.w3c.dom.ranges.Range;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int number = ran.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int guess;
        guess = sc.nextInt();
        while (guess!=number){
            if (guess<number){
                System.out.println("guess a higher number");
            } else {
                System.out.println("guess a lower number");
            }
            guess = sc.nextInt();
        }
        System.out.println("ta-da you got it. CONGRATULATIONS");
    }
}
