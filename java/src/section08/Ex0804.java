package section08;

public class Ex0804 {
  public static void main(String[] args) {
    Person Kim1 = new Person();
    Person Kim2 = new Person();

    Kim1.name = "김일남";
    Kim1.age = 99;
    Kim1.country = "한국";

    Kim2.name = "김이남";
    Kim2.age = 98;
    Kim2.country = "한국";

    System.out.printf("%s %d세(%s)\n", Kim1.name, Kim1.age, Kim1.country);
    System.out.printf("%s %d세(%s)\n", Kim2.name, Kim2.age, Kim2.country);
  }
}
