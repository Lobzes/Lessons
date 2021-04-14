import java.util.Calendar;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());

        int[] data = new int[n];
        for (int i = 0; i < n; i++){
            data[i] = Integer.parseInt(keyboard.nextLine());
        }
        if(n%2 == 0){
            for (int i = data.length - 1; i >= 0; i--){
                System.out.println(data[i]);
            }
        }else{
            for (int i = 0; i < data.length; i++){
                System.out.println(data[i]);
            }
        }
        }
    }
