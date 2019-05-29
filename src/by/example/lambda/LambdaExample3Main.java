package by.example.lambda;

public class LambdaExample3Main {

  public static void main(String[] args) {
    Action0 lambdaAction0 = () -> "executing action0";
    Action1 lambdaAction1 = x -> x * 10;
    Action2 lambdaAction2Sum = (x, y) -> x + y;
    Action2 lambdaAction2Div = (x, y) -> x / y;

    callAction(lambdaAction0);
    callAction(lambdaAction1, 30);
    callAction(lambdaAction2Sum, 30, 40);
    callAction(lambdaAction2Div, 30, 15);

    callAction(() -> "executing action0");
    callAction(x -> x * 10, 50);
    callAction((x, y) -> x - y, 50, 10);
  }

  private static void callAction(Action0 action) {
    System.out.println(action.execute());
  }

  private static void callAction(Action1 action, int x) {
    System.out.println(action.execute(x));
  }

  private static void callAction(Action2 action, int x, int y) {
    System.out.println(action.execute(x, y));
  }
}
