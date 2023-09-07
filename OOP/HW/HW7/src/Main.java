import java.util.Scanner;

/**
 * This is WH7 demo class.
 */
public class Main {
  /**
   * This is main method.
   *
   * @param args is input.
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Cake[] cake = new Cake[5];
    int count = 0;
    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
      int n = (int) (Math.random() * 2);
      String name = "";
      double rate = 0;
      if (n == 0) {
        System.out.println("Please enter Name, Rate, Weight.");
        double weight = 0;
        name = scn.next();
        rate = scn.nextDouble();
        weight = scn.nextDouble();
        cake[i] = new OrderCake(name, rate, weight);
      } else {
        System.out.println("Please enter Name, Rate, Quantity.");
        int quantity = 0;
        name = scn.next();
        rate = scn.nextDouble();
        quantity = scn.nextInt();
        cake[i] = new ReadyMadeCake(name, rate, quantity);
        arr[count] = i;
        count++;
      }
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(cake[i].toString());
    }

    double price = 0;
    for (int i = 0; i < 5; i++) {
      price += cake[i].calcPrice();
    }
    System.out.println("Total price of all cakes: " + price);

    double readyPrice = 0;
    int quantity = 0;
    for (int i = 0; i < count; i++) {
      readyPrice += cake[arr[i]].calcPrice();
      quantity += (int) (cake[arr[i]].calcPrice() / cake[arr[i]].getRate());
    }
    System.out.print("Total price and quantity of all ReadyMakeCake objects: ");
    System.out.println(readyPrice + ", " + quantity);

    double maxPrice = 0;
    for (int i = 0; i < 5; i++) {
      if (cake[i].calcPrice() > maxPrice) {
        maxPrice = cake[i].calcPrice();
      }
    }
    System.out.println("Highest price for cakes: " + maxPrice);
  }

}
