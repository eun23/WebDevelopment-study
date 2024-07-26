package section10.ex05;

public class Jump1005 {
  public static void main(String[] args) {
    HouseDog houseDog = new HouseDog("Poppy");
    houseDog.sleep();
    houseDog.gaurdHouse();

    Dog dog = houseDog;
    // dog.gaurdHouse(); - Error: 부모 클래스와 별개로 추가한 멤버 사용 불가
    dog.sleep(); // 부모 클래스의 메서드를 오버라이딩한 경우 자식 객체의 것 호출
  }
}
