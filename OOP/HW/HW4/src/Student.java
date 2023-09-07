/**
 * This is HW4 Student class.
 */
public class Student {
  private String name = "";
  private int age = 0;
  private double height = 0.0;
  private double weight = 0.0;

  //建構子

  /**
   * This is constructor of Student.
   *
   * @param name input parameters.
   * @param age input parameters.
   */
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /**
   *This is constructor of Student.
   *
   * @param name input parameters.
   * @param age input parameters.
   * @param height input parameters.
   * @param weight input parameters.
   */
  public Student(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  //Name

  /**
   *This is getName.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   *This is setName.
   *
   * @param name input parameters.
   */
  public void setName(String name) {
    if (name.length() <= 30) {
      this.name = name;
    }
  }

  //Age

  /**
   *This is getAge.
   *
   * @return age
   */
  public int getAge() {
    return age;
  }

  /**
   *This is setAge.
   *
   * @param age input parameters.
   */
  public void setAge(int age) {
    this.age = age;
  }

  //Height

  /**
   *This is getHeight.
   *
   * @return height
   */
  public double getHeight() {
    return height;
  }

  /**
   *This is setHeight.
   *
   * @param height input parameters.
   */
  public void setHeight(double height) {
    this.height = height;
  }

  //Weight

  /**
   *This is getWeight.
   *
   * @return weight
   */
  public double getWeight() {
    return weight;
  }

  /**
   *This is setWeight.
   *
   * @param weight input parameters.
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  //BMI

  /**
   *This is calculateBMI.
   *
   * @param height input parameters.
   * @param weight input parameters.
   * @return bmi
   */
  public double calculateBMI(double height, double weight) {
    double bmi;
    height = height / 100;
    bmi = weight / (height * height);
    return bmi;
  }

}
