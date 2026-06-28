import org.w3c.dom.ranges.Range;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int number = ran.nextInt(100);
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int guess;
        int num= 1;
        guess = sc.nextInt();
        while (guess!=number){
            num++;
            if (guess<number){
                System.out.println("guess a higher number");
            } else {
                System.out.println("guess a lower number");
            }
            System.out.println("enter your next guess number " + num);
            guess = sc.nextInt();
        }
        System.out.println("ta-da you got it. CONGRATULATIONS." +
                " you got it in "+ num + " tries");
    }
}
