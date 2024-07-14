package section06;

import java.util.Scanner;

public class Practice0603 {
  public static void main(String[] args) {
    int sum = 0;
    int start;
    int end;
    int number;

    Scanner scanner = new Scanner(System.in);

    System.out.print("시작 값을 입력하세요: ");
    start = scanner.nextInt();
    System.out.print("끝 값을 입력하세요: ");
    end = scanner.nextInt();

    System.out.print("홀수는 1, 짝수는 2를 입력하세요: ");
    number = scanner.nextInt();

    if(number == 1){
      for (int i = start; i <= end; i++) {
        if (i % 2 != 0) {
          sum += i;
        }
      }
    } else {
      for (int i = start; i <= end; i++) {
        if (i % 2 == 0) {
          sum += i;
        }
      }
    }


    String isOdd = number == 1 ? "홀수" : "짝수";

    System.out.printf("%d부터 %d까지의 %s의 합: %d",start, end, isOdd, sum);

    scanner.close();
  }
}
