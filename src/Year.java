import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        String AndIso;
        int clientDeviceYear;
        System.out.println("Введите платформу (Android/iSO) :");
        Scanner rty;
        rty = new Scanner(System.in);
        AndIso = rty.next();
        System.out.println("Введите год выпуска телефона :");
        Scanner rtyy;
        rtyy = new Scanner(System.in);
        clientDeviceYear = rtyy.nextInt();
        if (AndIso.equals("Android") && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (AndIso.equals("iSO") && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iSO по ссылке");
        }
        else if (AndIso.equals("iSO") && (clientDeviceYear <= 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(AndIso.equals("Android") && (clientDeviceYear <= 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }
    }




