package section10.finalexample;

class NomalClass {

}

class ChildNomalClass extends NomalClass {

}

final class FinalClass { // Error 원인

}

// class ChildFinalClass extends FinalClass { - Error 상속 불가능

// }

public class Ex1003 {
  public static void main(String[] args) {
    ChildNomalClass cnc = new ChildNomalClass();
    System.out.println(cnc);
  }
}
