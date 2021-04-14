import java.util.Scanner;

public class Lessons3 {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        System.out.print("Введите число (0 или любое отрицательное," +
                "что бы выйти):");
        int number = keybord.nextInt();

        int largest = 0;

        while (number > 0 ) {
            if (number > largest);{
                largest = number;
            }
            number = keybord.nextInt();
        }
        System.out.println("Наибольшее число:"+ largest);
        keybord.close();
    }
}
