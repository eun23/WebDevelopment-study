package section03;

public class Practice0306 {
  public static void main(String[] args) {
    int x = 2;
    int y = 5;
    char c = 'A'; //65

    System.out.println(y >= 5 || x < 0 && x > 2); // true || false && false => true || true => true
    System.out.println(y += 10 - x++); // 15 - 2 = 13
    System.out.println(!('A' <= c && c <= 'Z')); // false
    System.out.println(++c); // B
    System.out.println(c + 1); // 67
  }
}
