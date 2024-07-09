package section05;

public class Ex0505 {
  public static void main(String[] args) {
    // 1~10 짝수 출력
    int number = 1;
    while (true) {
      if (number % 2 != 0) {
        number++;
        continue;
      }
      System.out.printf("%d ", number);
      number++;
      if (number >= 10) {
        break;
      }
    }
  }
}
