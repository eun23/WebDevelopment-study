package section02;

public class Constant {
  // main + tab키 메인 메서드 자동완성
  public static void main(String[] args) {
    // 상수(final)
    // 상수명은 대문자 스네이크 케이스로 작명
    /*
     * PascalCase(upper camel case)
     * camelCase(lower camel case)
     */
    final double CONSTANT_PI = 3.14;
    // CONSTANT_PI = 4.14; - Error
    System.out.println(CONSTANT_PI);
  }
}
