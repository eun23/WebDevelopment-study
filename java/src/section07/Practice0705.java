package section07;

import java.util.Scanner;

public class Practice0705 {
  public static void main(String[] args) {
    int target;

    Scanner scanner = new Scanner(System.in);

    System.out.print("찾을 값을 입력하세요: ");
    target = scanner.nextInt();

    int numbers[] = { 10, 20, 30, 40, 50 };
    boolean found = false;

    for (int number : numbers) {
      if (number == target) {
        found = true;
      }
    }

    if (found) {
      System.out.println("배열에 " + target + "값이 존재합니다.");
    } else {
      System.out.println("배열에 " + target + "값이 존재하지 않습니다.");
    }

    scanner.close();
  }
}
