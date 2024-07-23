package section10.finalexample;

class NomalMethod {
  void nomalMethod() {
    System.out.println("nomalMethod!");
  }
}

class ChildNomalMethod extends NomalMethod {
  @Override
  void nomalMethod() {
    System.out.println("ChildNomalMethod.namalMethod!");
  }
}

class FinalMethod { 
  final void finalMethod() { // Error 원인
    System.out.println("finalMethod!");
  }
}

// class ChildFinalMethod extends FinalMethod { 
//   @Override
//   void finalMethod() { - Error 오버라이딩 불가능
//     System.out.println("ChildfinalMethod.finalMethod!");
//   }
// }

public class Ex1004 {
  public static void main(String[] args) {
    ChildNomalMethod cnm = new ChildNomalMethod();
    cnm.nomalMethod();
  }
}
