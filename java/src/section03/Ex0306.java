package section03;

public class Ex0306 {
  public static void main(String[] args) {
    // 이항 - 비교 연산자
    int num1 = 1;
    int num2 = 2;

    System.out.println("num1 < num2\t: " + (num1 < num2));
    System.out.println("num1 > num2\t: " + (num1 > num2));
    System.out.println("num1 <= num2\t: " + (num1 <= num2));
    System.out.println("num1 >= num2\t: " + (num1 >= num2));
    System.out.println("num1 == num2\t: " + (num1 == num2));
    System.out.println("num1 != num2\t: " + (num1 != num2));
    System.out.println("num1 == num2\t: " + (num1 == --num2));
  }
}
