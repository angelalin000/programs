import java.util.Scanner;

/**
 * This is HW4 demo class.
 */
public class Main {

  /**
   * This is the main for this project.
   *
   * @param args input parameters.
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    //Mary的資訊
    double height = 0.0;
    System.out.println("請輸入Mary的身高:");
    Student mary = new Student("Mary", 15);
    height = scn.nextDouble();
    if (height > 300 || height < 1) {
      System.out.println("輸入身高無效,請重新輸入。");
      System.out.println("請輸入Mary的身高:");
      height = scn.nextDouble();
    }

    double weight = 0.0;
    mary.setHeight(height);
    System.out.println("請輸入Mary的體重:");
    weight = scn.nextDouble();
    if (weight > 300 || weight < 1) {
      System.out.println("輸入體重無效,請重新輸入。");
      System.out.println("請輸入Mary的體重:");
      weight = scn.nextDouble();
    }
    mary.setWeight(weight);

    //Sam的資訊
    System.out.println("請輸入Sam的身高:");
    Student sam  = new Student("Sam", 29);
    height = scn.nextDouble();
    if (height > 300 || height < 1) {
      System.out.println("輸入身高無效,請重新輸入。");
      System.out.println("請輸入Sam的身高:");
      height = scn.nextDouble();
    }
    sam.setHeight(height);
    System.out.println("請輸入Sam的體重:");
    weight = scn.nextDouble();
    if (weight > 300 || weight < 1) {
      System.out.println("輸入體重無效,請重新輸入。");
      System.out.println("請輸入Sam的體重:");
      weight = scn.nextDouble();
    }
    sam.setWeight(weight);

    //Tom的資訊
    Student tom = new Student("Tom", 18, 180.0, 54.8);

    System.out.println("Name: " + tom.getName());
    System.out.println("Age: " + tom.getAge());
    System.out.print("BMI: ");
    System.out.printf("%.2f\n",  + tom.calculateBMI(tom.getHeight(), tom.getWeight()));

    System.out.println("Name: " + mary.getName());
    System.out.println("Age: " + mary.getAge());
    System.out.print("BMI: ");
    System.out.printf("%.2f\n",  + mary.calculateBMI(mary.getHeight(), mary.getWeight()));

    System.out.println("Name: " + sam.getName());
    System.out.println("Age: " + sam.getAge());
    System.out.print("BMI: ");
    System.out.printf("%.2f\n",  + sam.calculateBMI(sam.getHeight(), sam.getWeight()));
  }

}
