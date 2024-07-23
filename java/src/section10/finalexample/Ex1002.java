package section10.finalexample;

class FinalFeild {
  final int finalFeild; // Error 원인

  FinalFeild(int finalFeild) {
    this.finalFeild = finalFeild;
  }

  // void setfinalField(int finalFeild) {
  //   this.finalFeild = finalFeild; // Error - 한 번 초기화된 후에는 변경 불가 !
  // }
}

public class Ex1002 {
  public static void main(String[] args) {
    
  }
}
