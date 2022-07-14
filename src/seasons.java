import java.util.Scanner;
public class seasons {
    public static void main(String[] args) {
        int monthNumbe;
        System.out.print("Введите число месяца :");
        Scanner qwe;
        qwe = new Scanner(System.in);
        monthNumbe = qwe.nextInt();

        switch (monthNumbe) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Зима");
            default:
                System.out.println("Такго месяца не существует");
        }
    }
}
