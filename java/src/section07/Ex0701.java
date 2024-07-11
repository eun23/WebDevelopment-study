package section07;

public class Ex0701 {
  public static void main(String[] args) {
    int[] oddArr = { 1, 3, 5, 7, 9 };
    int evenArr[] = { 2, 4, 6, 8, 10 };

    System.out.println("oddArr\t\t: " + oddArr);

    /*
     * [ 배열
     * I 정수형(int)
     * 
     * @
     * 372f7a8d 배열 객체 해시코드(16진수 표현)
     */

    System.out.println("oddArr[0]\t: " + oddArr[0]);
    System.out.println("oddArr[1]\t: " + oddArr[1]);
    System.out.println("oddArr[2]\t: " + oddArr[2]);
    System.out.println("oddArr[3]\t: " + oddArr[3]);
    System.out.println("oddArr[4]\t: " + oddArr[4]);
    // System.out.println("oddArr[5]\t: " + oddArr[5]); - Error

    System.out.println();

    System.out.println("oddArr.length\t: " + oddArr.length);

    System.out.println();

    for(int i = 0; i<5; i++) {
      System.out.printf("oddArr[%d]\t: %d\n", i, oddArr[i]);
    }

  }
}
