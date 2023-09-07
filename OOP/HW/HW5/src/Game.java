import java.util.Random;

/**
 * This is Game class.
 */

public class Game {
  private Gesture[] gestures = new Gesture[3];

  /**
   * This is startGame method.
   */
  public void startGame() {
    for (int i = 0; i < 3; i++) {
      int r = 0;
      r = (int) (Math.random() * (3));
      switch (r) {
        case 0:
          gestures[i] = Gesture.stone;
          break;
        case 1:
          gestures[i] = Gesture.paper;
          break;
        case 2:
          gestures[i] = Gesture.scissors;
          break;
        default:
          break;
      }
    }
  }

  /**
   * This is compare method.
   *
   * @param playerGesture is input.
   * @return is return.
   */
  public String compare(Gesture[] playerGesture) {
    int flag = 0;
    String[] string = new String[3];
    for (int i = 0; i < 3; i++) {
      if (playerGesture[i] == gestures[i]) {
        string[i] = "Same";
        continue;
      } else if (playerGesture[i] == Gesture.stone) {
        if (gestures[i] == Gesture.paper) {
          string[i] = "Lose";
          flag++;
        } else {
          string[i] = "Win";
          flag--;
        }
      } else if (playerGesture[i] == Gesture.paper) {
        if (gestures[i] == Gesture.scissors) {
          string[i] = "Lose";
          flag++;
        } else {
          string[i] = "Win";
          flag--;
        }
      } else {
        if (gestures[i] == Gesture.stone) {
          string[i] = "Lose";
          flag++;
        } else {
          string[i] = "Win";
          flag--;
        }
      }
    }

    String result = "";
    if (flag < 0) {
      result = "You win!";
    } else if (flag > 0) {
      result = "You lose!";
    } else {
      result = "Game tie";
    }
    return result;
  }
}
