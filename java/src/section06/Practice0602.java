package section06;

import java.util.Scanner;

public class Practice0602 {
  public static void main(String[] args) {
    String correntPassword = "java";
    String password;

    Scanner scanner = new Scanner(System.in);

    System.out.print("비밀번호를 입력하세요: ");
    password = scanner.nextLine();

    while (!correntPassword.equals(password)) {
      System.out.println("잘못된 비밀번호입니다.");
      System.out.print("비밀번호를 입력하세요: ");
      password = scanner.nextLine();
    }

    System.out.println("확인되었습니다.");
    scanner.close();
  }
}
