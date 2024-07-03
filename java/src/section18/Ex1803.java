package section18;

public class Ex1803 {
  public static void main(String[] args) {
    System.out.println(String.format("I eat %d apples", 5));

    System.out.printf("I eat %d apples\n", 5);
    System.out.printf("I eat %f apples\n", 2.5);
    System.out.printf("I eat %.1f apples\n", 2.5); // 소수점 첫째자리까지만 출력
    System.out.printf("I eat %s apples\n", "five");
    System.out.printf("I eat %s apples", 2.50);

    System.out.printf("I have completed %d%% of my Java studies.\n", 100);
    System.out.printf("I have completed %d%% of my %s studies.\n", 100, "Java");
    System.out.printf("I have completed %3d%% of my %s studies.\n", 90, "Java"); // 열 맞추기(우측 정렬)
    System.out.printf("I have completed %-3d%% of my %s studies.\n", 90, "Java"); // 열 맞추기(좌측 정렬)
    System.out.printf("I have completed %.2f%% of my %s studies.\n", 99.999999, "Java"); // 반올림
  }
}
