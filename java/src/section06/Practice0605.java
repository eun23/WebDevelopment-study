package section06;

import java.util.Scanner;

public class Practice0605 {
  public static void main(String[] args) {
    String input;
    String reversed = "";

    Scanner scanner = new Scanner(System.in);

    System.out.print("문자열을 입력하세요: ");
    input = scanner.nextLine();

    for (int i = input.length() - 1; i >= 0; i--) {
      reversed += input.charAt(i);
    }

    System.out.printf("문자열 뒤집기: %s", reversed);

    scanner.close();
  }
}
