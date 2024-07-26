package section10.ex05;

public class HouseDog extends Dog {
  HouseDog(String name) {
    super(name);
  }

  @Override
  void sleep() {
    System.out.print(this.name + " in house ");
    super.sleep();
  }

  void gaurdHouse() {
    System.out.println(this.name + "는 집을 지킨다");
  }
}
