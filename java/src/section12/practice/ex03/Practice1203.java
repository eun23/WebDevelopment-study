package section12.practice.ex03;

interface Drivable {
  void drive();
}

interface Flyable {
  void fly();
}

class FlyingCar implements Drivable, Flyable {
  @Override
  public void drive() {
    System.out.println("Driving in the road.");
  }

  @Override
  public void fly() {
    System.out.println("Flying in the sky.");
  }
}

public class Practice1203 {
  public static void main(String[] args) {
    FlyingCar mFlyingCar = new FlyingCar();
    mFlyingCar.drive();
    mFlyingCar.fly();
  }
}
