import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("Название месяца и количество дней");
        String verse = keybord.nextLine();
        int numDays = 0;
        switch (verse){
            case "Январь":
            case "Март":
            case "Май":
            case "Июль":
            case "Август":
            case "Октябрь":
            case "Декабрь":
                numDays = 31;
                break;
            case "Февраль":
                numDays = 28;
                break;
            case "Апрель":
            case "Июнь":
            case "Сентябрь":
            case "Ноябрь":
                numDays = 30;
                break;
        }
        System.out.println("Это високосный год (да/нет)?");
        String isLeapYear = keybord.next();
        if (verse.equals("Февраль")&& isLeapYear.equals("да")){
            numDays = 29;
        }
        System.out.println(verse + ", Число дней:");
        System.out.println(numDays);
    }


}
