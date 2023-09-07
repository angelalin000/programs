/**
 * This is GeneralGame class.
 */
public class GeneralGame extends PlayGenerator {
  /**
   * This is play method.
   *
   * @param user is user's gesture.
   *
   * @return the game's result.
   */
  public String play(Gesture[] user) {
    int flag = 0;
    for (int i = 0; i < 3; i++) {
      Gesture computer = generateGestureByRandom();
      if (computer == user[i]) {
        continue;
      } else if (computer == Gesture.stone) {
        if (user[i] == Gesture.paper) {
          flag++;
        } else {
          flag--;
        }
      } else if (computer == Gesture.paper) {
        if (user[i] == Gesture.scissors) {
          flag++;
        } else {
          flag--;
        }
      } else {
        if (user[i] == Gesture.stone) {
          flag++;
        } else {
          flag--;
        }
      }
    }
    String result = "";
    if (flag > 0) {
      result = "You win!";
    } else if (flag < 0) {
      result = "You lose!";
    } else {
      result = "Game tie";
    }
    return result;
  }
}
