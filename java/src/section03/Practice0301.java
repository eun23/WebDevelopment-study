package section03;

public class Practice0301 {
  public static void main(String[] args) {
    int num1 = 15;
    int num2 = 4;

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    double quotient = (double) num1 / num2;
    double remainder = (double) num1 % num2;

    System.out.println("합\t: " + sum);
    System.out.println("차\t: " + difference);
    System.out.println("곱\t: " + product);
    System.out.println("몫\t: " + quotient);
    System.out.println("나머지\t: " + remainder);
  }
}
