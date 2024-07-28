package section11.class_case;

class Animal {
  String name;

  void setName(String name) {
    this.name = name;
  }
}

class Tiger extends Animal {
}

class Lion extends Animal {
}

class Crocodile extends Animal {}

class Zookeeper {
  void feed(Tiger tiger) {
    System.out.println("feed tiger food.");
  }

  void feed(Lion lion) {
    System.out.println("feed lion food.");
  }

  void feed (Crocodile crocodile) {
    System.out.println("feed crocodile food.");
  }
}

public class Jump1101 {
  public static void main(String[] args) {
    Zookeeper zookeeper = new Zookeeper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    Crocodile crocodile = new Crocodile();

    zookeeper.feed(tiger);
    zookeeper.feed(lion);
    zookeeper.feed(crocodile);
  }
}
