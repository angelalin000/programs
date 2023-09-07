/**
 * This is OrderCake class.
 */
public class OrderCake extends Cake {
  private double weight = 0;

  @Override
  public double calcPrice() {
    return getRate() * weight;
  }

  public OrderCake(String name, double rate, double weight) {
    super(name, rate);
    this.weight = weight;
  }

}
