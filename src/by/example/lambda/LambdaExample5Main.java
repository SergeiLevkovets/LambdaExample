package by.example.lambda;

public class LambdaExample5Main {

  public static void main(String[] args) {
    Action1Factory factory = new Action1Factory() {
      @Override
      public Action1 createAction(int value) {
        return new MultiplyAction(value);
      }
    };

    Action1 action1 = factory.createAction(10);
    System.out.println("multiply1: " + action1.execute(2));

    Action1Factory mulFactory = MultiplyAction::new;
    Action1Factory divFactory = DivideAction::new;

    System.out.println("multiply2: " + mulFactory.createAction(10).execute(2));
    System.out.println("divide: " + divFactory.createAction(2).execute(10));
  }
}
