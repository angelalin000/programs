/**
 * This is ReadyMadeCake class.
 */
public class ReadyMadeCake extends Cake {
  private int quantity = 0;

  @Override
  public double calcPrice() {
    return getRate() * quantity;
  }

  public ReadyMadeCake(String name, double rate, int quantity) {
    super(name, rate);
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }
}
