import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
 String AndIso;
 System.out.println("Введите платформу (Android/iSO) :");
 Scanner rty = new Scanner(System.in);
 AndIso = rty.next();
 if (AndIso.equals("Android")){
     System.out.println("Установите версию приложения для Android по ссылке");
 } else{
     System.out.println("Установите версию приложения для iOS по ссылке");
 }


    }
}
