import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Guess a random number between 0-100");
        Random ran = new Random();
        int number = ran.nextInt(100);
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
        System.out.println("Ta-da! Congratulations!");
        System.out.println("You got it in " + num + " tries.");
    }
}
