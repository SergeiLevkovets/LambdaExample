package by.example.lambda;

public class LambdaExample4Main {

  public static void main(String[] args) {
    Methods methods = new Methods();
    Action0 action0AsMethodReference = Methods::createMessage;
    Action1 mul = methods::multiply;
    Action2 sum = methods::sum;
    Action2 div = methods::div;

    callAction(action0AsMethodReference);
    callAction(mul, 30);
    callAction(sum, 30, 40);
    callAction(div, 100, 25);
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
