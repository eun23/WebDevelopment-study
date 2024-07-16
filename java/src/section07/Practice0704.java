package section07;

public class Practice0704 {
  public static void main(String[] args) {
    int numbers[] = { 10, 20, 30, 40, 50 };

    int max = numbers[0];
    int min = numbers[0];

    for (int number : numbers) {
      if (number > max) {
        max = number;
      }
      if (number < min) {
        min = number;
      }
    }

    System.out.println("배열의 최대값: " + max);
    System.out.println("배열의 최소값: " + min);
  }
}
