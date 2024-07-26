package section10.casting;

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class Ex1005 {
  public static void main(String[] args) {
    Animal animal = new Animal();
    // Dog dogAnimal = (Dog) animal; - Error: ClassCastException
    System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // false

    Animal animalDog = new Dog(); // 자동 형변환
    Dog dogAnimalDog = (Dog) animalDog; // 강제 형변환
    System.out.println("animalDog instanceof Dog: " + (animalDog instanceof Dog)); // true

    Animal animalCat = new Cat(); // 자동 형변환
    // Dog dogAnimalCat = (Dog) animalCat;  - Error: ClassCastException, 직접 상속관계가 아니면 형변환 불가
    System.out.println("animalCat instanceof Dog: " + (animalCat instanceof Dog)); // false

    // IS-A 관계: 형변환 가능
  }
}
