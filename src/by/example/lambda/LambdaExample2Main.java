package by.example.lambda;

public class LambdaExample2Main {

  public static void main(String[] args) {
    Action0 lambdaAction0 = () -> "executing action0";
    Action1 lambdaAction1 = x -> x * 10;
    Action2 lambdaAction2Sum = (x, y) -> x + y;
    Action2 lambdaAction2Div = (x, y) -> x / y;

    System.out.println(lambdaAction0.execute());
    System.out.println(lambdaAction1.execute(10));
    System.out.println(lambdaAction2Sum.execute(10, 20));
    System.out.println(lambdaAction2Div.execute(20, 10));
  }
}
