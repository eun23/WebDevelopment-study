package section12.practice.ex04;

interface Drivable {
  void drive();
}

interface Flyable {
  void fly();
}

interface Machine {
  void start();
  void stop();
}

interface FlyingMachine extends Drivable, Flyable, Machine {
  
}

class FlyingCar implements FlyingMachine {
  @Override
  public void start() {
    System.out.println("Starting the flying car.");
  }

  @Override
  public void drive() {
    System.out.println("Driving in the road.");
  }

  @Override
  public void fly() {
    System.out.println("Flying in the sky.");
  }

  @Override
  public void stop() {
    System.out.println("Stopping the flying car.");
  }
}

public class Practice1204 {
  public static void main(String[] args) {
    FlyingCar mFlyingCar = new FlyingCar();

    mFlyingCar.start();
    mFlyingCar.drive();
    mFlyingCar.fly();
    mFlyingCar.stop();
  }
}
