import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = keybord.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n;i++) {
            factorial *= i;
            }
        System.out.println(n + " ! равен"+ " " + factorial);
        keybord.close();


        }
    }
