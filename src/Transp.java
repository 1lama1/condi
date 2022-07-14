public class Transp {
    public static void main(String[] args) {
      int  deliveryDistance = 95;
      if (deliveryDistance<20){
          System.out.println("Доставка 1 день ");
        }
      if (deliveryDistance>=20 && deliveryDistance<60) {
          System.out.println("Доставка 2 дня");
      }
      if (deliveryDistance>=60 && deliveryDistance<100){
          System.out.println("Доставка 3 дня ");
      }
    }
}
