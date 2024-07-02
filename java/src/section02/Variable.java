package section02;
/*
 * 기본 자료형(primitive type)
 * - 정수(3): byte(1byte == 8bit), short(2byte), int(4byte), long(8byte)
 * - 실수(3.14): float(4byte), double(8byte)
 * - 문자(a, b, c, ...): char(2byte)
 * - boolean(참/거짓): true/false
 * 
 * 참조 자료형(reference type)
 * - 문자열(abc): String
 * - 배열
 * - 객체
 */
public class Variable {
  public static void main(String[] args) {
    // 변수(variable): 변할 수 있는 수
    // 작명 방식: camelCase(lower camel case)
    int a; // 변수 선언
    a = 3; // 변수 초기화: a에 3을 할당(대입: assignment)
    System.out.println(a);

    int b = 5; // 변수 정의(선언 + 초기화)
    System.out.println(b); // sout + tab키 자동 완성

    a = 10;
    System.out.println(a);
  }
}
