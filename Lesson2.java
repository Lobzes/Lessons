import java.util.Random;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(100)+1;
        System.out.println("**********");
        System.out.println("welcome to the game baddy !");
        System.out.println("**********");
        System.out.println();

        System.out.println("Ввеедите число от 1 до 100");
        int inputNumber = keybord.nextInt();
        numGuesses ++;

        while (inputNumber != randomNumber){
            if (randomNumber < inputNumber) {
                System.out.println("Попробуйте меньшее число ");
            }else {
                System.out.println("Попробуйте большее число");
            }
            System.out.println();
            System.out.println("Попытайтесь ещё раз...");
            System.out.println("Введите число от 1 до 100: ");
            inputNumber = keybord.nextInt();
            numGuesses ++;
        }
        System.out.println("Вы угадали после");
        System.out.println(numGuesses+ " " + "попыток");
    }

}
