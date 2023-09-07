import java.util.Scanner;

/**
 * This is Main class.
 */
public class Main {
  /**
   * This is main method.
   *
   * @param args is input.
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Please enter game count.(3 or 5)");
    int n = 0;
    n = scn.nextInt();
    while (n != 3 && n != 5) {
      System.out.println("Please re-enter game count.(3 or 5)");
      System.out.println("Please enter game count.(3 or 5)");
      n = scn.nextInt();
    }

    if (n == 3) {
      String result = "Game tie";
      while (result.equals("Game tie")) {
        String[] player = new String[3];
        System.out.println("Please enter your gesture.");
        GeneralGame game = new GeneralGame();
        for (int i = 0; i < 3; i++) {
          player[i] = scn.next();
          int flag = 0;
          String paper = "paper";
          String stone = "stone";
          String scissors = "scissors";
          if (player[i].equals(stone) || player[i].equals(paper) || player[i].equals(scissors)) {
            flag = 1;
          }
          while (flag == 0) {
            System.out.println("Please re-enter the gesture.");
            player[i] = scn.next();
            if (player[i].equals(stone) || player[i].equals(paper) || player[i].equals(scissors)) {
              flag = 1;
            }
          }
        }
        Gesture[] playerGesture = new Gesture[3];
        for (int i = 0; i < 3; i++) {
          if (player[i].equals("stone")) {
            playerGesture[i] = Gesture.stone;
          } else if (player[i].equals("paper")) {
            playerGesture[i] = Gesture.paper;
          } else {
            playerGesture[i] = Gesture.scissors;
          }
        }
        result = game.play(playerGesture);
        System.out.println(result);
      }
      System.out.println("Game over.");
    } else {
      String result = "Game tie";
      while (result.equals("Game tie")) {
        String[] player = new String[5];
        System.out.println("Please enter your gesture.");
        GeneralGame game = new GeneralGame();
        for (int i = 0; i < 5; i++) {
          player[i] = scn.next();
          int flag = 0;
          if (player[i].equals("stone") || player[i].equals("paper")
              || player[i].equals("scissors")) {
            flag = 1;
          }
          while (flag == 0) {
            System.out.println("Please re-enter the gesture.");
            player[i] = scn.next();
            if (player[i].equals("stone") || player[i].equals("paper")
                || player[i].equals("scissors")) {
              flag = 1;
            }
          }
        }
        Gesture[] playerGesture = new Gesture[3];
        for (int i = 0; i < 3; i++) {
          if (player[i].equals("stone")) {
            playerGesture[i] = Gesture.stone;
          } else if (player[i].equals("paper")) {
            playerGesture[i] = Gesture.paper;
          } else {
            playerGesture[i] = Gesture.scissors;
          }
        }
        result = game.play(playerGesture);
        System.out.println(result);
      }
      System.out.println("Game over.");
    }
  }
}
