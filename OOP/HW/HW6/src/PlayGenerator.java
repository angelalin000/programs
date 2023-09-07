/**
 * This is PlayGenerator class.
 */
public class PlayGenerator {
  /**
   * This is generateGestureByRandom method.
   *
   * @return gesture.
   */
  public Gesture generateGestureByRandom() {
    Gesture gesture = Gesture.paper;
    int r = 0;
    r = (int) (Math.random() * (3));
    switch (r) {
      case 0:
        gesture = Gesture.stone;
        break;
      case 1:
        gesture = Gesture.paper;
        break;
      case 2:
        gesture = Gesture.scissors;
        break;
      default:
        break;
    }
    return gesture;
  }
}
