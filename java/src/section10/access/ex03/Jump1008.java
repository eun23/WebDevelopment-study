package section10.access.ex03;

import section10.access.ex02.HouseKimDefault;

class HouseKimProtectedChild extends HouseKimDefault {
  String lastname = super.lastname;
}

public class Jump1008 extends HouseKimDefault{
  public static void main(String[] args) {
    HouseKimProtectedChild kim = new HouseKimProtectedChild();
    System.out.println(kim.lastname);

    Jump1008 kim2 = new Jump1008();
    System.out.println(kim2.lastname);
  }
}
