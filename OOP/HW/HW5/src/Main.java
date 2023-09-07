import java.util.Scanner;

/**
 * This is HW5 demo class.
 */
public class Main {
  /**
   * This is the main for this project.
   *
   * @param args is input.
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    Game newGame = new Game();
    String result = "Game tie";
    while (result == "Game tie") {
      newGame.startGame();
      String[] player = new String[3];
      System.out.println("Please enter your gesture.");
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
          flag = 0;
          if (player[i].equals(stone) || player[i].equals(paper) || player[i].equals(scissors)) {
            flag = 1;
          }
        }
      }
      Gesture[] playerGesture = new Gesture[3];
      for (int i = 0; i < 3; i++) {
        if (player[i] == "stone") {
          playerGesture[i] = Gesture.stone;
        } else if (player[i] == "paper") {
          playerGesture[i] = Gesture.paper;
        } else {
          playerGesture[i] = Gesture.scissors;
        }
      }
      result = newGame.compare(playerGesture);
      System.out.println(result);
    }
    System.out.println("Game over.");
  }
}
