package section11.practice.p01;

abstract class Printable {
  abstract void print(String document);
}

abstract class Scannable {
  abstract void scan(String document);
}

class SamsungPrinter extends Printable {
  @Override
  void print(String document) {
    System.out.println("Printing: " + document);
  }
}

class SamsungScaner extends Scannable {
  @Override

  void scan(String document) {
    System.out.println("Scanning: " + document);
  }
}

public class Practice01 {
  public static void main(String[] args) {
    SamsungPrinter sp = new SamsungPrinter();
    SamsungScaner ss = new SamsungScaner();

    sp.print("Document1.pdf");
    ss.scan("Document2.pdf");
  }
}
