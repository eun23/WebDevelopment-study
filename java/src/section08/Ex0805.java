package section08;

public class Ex0805 {
  public static void main(String[] args) {
    Person.staticCountry = "한국";

    Person Kim1 = new Person();
    Person Kim2 = new Person();
    Person Kim3 = new Person();

    Kim1.name = "김일남";
    Kim1.age = 99;
    // Kim1.country = "한국";

    Kim2.name = "김이남";
    Kim2.age = 98;
    // Kim2.country = "한국";

    Kim3.name = "김삼남";
    Kim3.age = 97;

    System.out.printf("%s %d세(%s)\n", Kim1.name, Kim1.age, Person.staticCountry);
    System.out.printf("%s %d세(%s)\n", Kim2.name, Kim2.age, Person.staticCountry);
    System.out.printf("%s %d세(%s)\n", Kim3.name, Kim3.age, Person.staticCountry);
  }
}
