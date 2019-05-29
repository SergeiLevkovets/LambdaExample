package by.example.lambda;

public class DivideAction implements Action1 {

  private int divideOn;

  public DivideAction(int divideOn) {
    this.divideOn = divideOn;
  }

  @Override
  public int execute(int x) {
    return x / divideOn;
  }
}
