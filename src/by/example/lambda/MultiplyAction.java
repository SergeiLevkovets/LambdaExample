package by.example.lambda;

public class MultiplyAction implements Action1 {

  private int coefficient;

  public MultiplyAction(int coefficient) {
    this.coefficient = coefficient;
  }

  @Override
  public int execute(int x) {
    return x * coefficient;
  }
}
