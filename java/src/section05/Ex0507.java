package section05;

public class Ex0507 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.printf("%d ", i);
      }
    }

    System.out.println();

    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        System.out.printf("%d ", i);
      }
    }
  }
}
