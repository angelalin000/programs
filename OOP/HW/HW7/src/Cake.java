/**
 * This is Cake class.
 */
public abstract class Cake {
  private String name = "";
  private double rate = 0;

  public Cake(String name, double rate) {
    this.name = name;
    this.rate = rate;
  }

  public String getName() {
    return name;
  }

  public double getRate() {
    return rate;
  }

  public abstract double calcPrice();

  public String toString() {
    return name + "\t" + rate;
  }
}
