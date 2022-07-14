import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Введите год :");
        Scanner qwe;
        qwe = new Scanner(System.in);
        year = qwe.nextInt();
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year+" год является високосным ");
        }else {
            System.out.println(year+"  год не является високосным");
        }

    }
}
