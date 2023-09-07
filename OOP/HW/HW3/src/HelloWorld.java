import java.util.Scanner;

/**
 *This is HW3 demo class.
 */
public class HelloWorld {
  /**
   *This is the main for this project.
   *
   * @param args input parameters.
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int grade = 0;
    double average = 0.0;
    for (int i = 0; i < 5; i++) {
      System.out.println("請輸入成績:");
      grade = scn.nextInt();
      while (grade < 0 || grade > 100) {
        System.out.println("輸入為無效成績，請重新輸入");
        System.out.println("請輸入成績:");
        grade = scn.nextInt();
      }
      average += grade;
      grade /= 10;

      switch (grade) {
        case 10: case 9:
          System.out.println("A");
          break;
        case 8:
          System.out.println("B");
          break;
        case 7:
          System.out.println("C");
          break;
        case 6:
          System.out.println("D");
          break;
        case 5:
          System.out.println("E");
          break;
        default:
          System.out.println("F");
      }
    }
    average = average / 5;
    System.out.printf("Score Average: %.2f", average);
  }

}
