/**
 * this is StringOperation code.
 */
public class StringOperation {
  /**
   * this is main method.
   *
   * @param args is user input.
   */
  public static void main(String[] args) {

    String school = "Feng Chia University";
    String department = "Information Engineering and Computer Science";
    String sentence = department + " of " + school;

    int len = sentence.length();
    int index = sentence.lastIndexOf('n');

    System.out.println("length: " + len);
    System.out.println("index of last \'n\': " + index);

    String[] split = sentence.split(" ");
    System.out.println(split[3]);

    String replaced = sentence.replace("e", "1");
    System.out.println(replaced);

  }
}
