package section06;

import java.util.Scanner;

public class Practice0604 {
  public static void main(String[] args) {
    int dan;

    Scanner scanner = new Scanner(System.in);

    System.out.print("출력할 구구단의 단을 입력하세요: ");
    dan = scanner.nextInt();

    for (int i = 1; i < 10; i++) {
      System.out.printf("%d x %d = %d\n", dan, i, dan * i);
    }

    scanner.close();
  }
}
