package by.example.lambda;

public class LambdaExample1Main {

  public static void main(String[] args) {
    Action0 innerAction0 = new Action0() {
      @Override
      public String execute() {
        return "executing action0";
      }
    };

    Action1 innerAction1 = new Action1() {
      @Override
      public int execute(int x) {
        return x * 10;
      }
    };

    Action2 innerAction2 = new Action2() {
      @Override
      public int execute(int x, int y) {
        return x + y;
      }
    };

    System.out.println(innerAction0.execute());
    System.out.println(innerAction1.execute(10));
    System.out.println(innerAction2.execute(10, 20));
  }
}
