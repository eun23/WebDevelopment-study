package section13.ex05_lambda.anonymus_lamda;

@FunctionalInterface
interface Calculator {
  int calculator(int a, int b);
}

@FunctionalInterface
interface AbsoluteCalculator {
  int calculator(int a);
}

public class ex1306 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;

    Calculator add = (int a, int b) -> {
      return a + b;
    };

    Calculator sub = (a, b) -> {
      return a - b;
    };

    Calculator mul = (a, b) -> a * b;

    Calculator div = (a, b) -> { // 코드가 여러 줄일 경우, 중괄호{} 생략 불가
      System.out.println("마지막 계산은 나누기");
      return a / b;
    };

    System.out.println("add: " + add.calculator(num1, num2));
    System.out.println("sub: " + sub.calculator(num1, num2));
    System.out.println("mul: " + mul.calculator(num1, num2));
    System.out.println("div: " + div.calculator(num1, num2));

    System.out.println();

    int number = -10;
    AbsoluteCalculator abs1 = (a) -> a < 0 ? -a : a;
    System.out.println("abs1: " + abs1.calculator(number));

    AbsoluteCalculator abs2 = (a) -> {
      int newNumber = a < 0 ? -a : a;
      return newNumber;
    };
    System.out.println("abs2: " + abs2.calculator(number));
  }
}
