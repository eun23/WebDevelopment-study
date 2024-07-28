package section11.interface_case;

public class Ex1102 {
  public static void main(String[] args) {
    SamsungTV samsungTV = new SamsungTV();
    samsungTV.userGuide();
    samsungTV.turnOn();
    samsungTV.fold();
    samsungTV.setVolume(120);
    System.out.println("SamsungTV Volume: " + samsungTV.getVolume());
    samsungTV.turnOff();
    samsungTV.unfold();

    System.out.println();

    LGTV lgTV = new LGTV();
    lgTV.turnOn();
    lgTV.rollUp();
    lgTV.setVolume(-120);
    System.out.println("LGTV Volume: " + lgTV.getVolume());
    lgTV.turnOff();
    lgTV.rollDown();

    System.out.println();

    SamsungLGTV samsungLGTV = new SamsungLGTV();
    samsungLGTV.turnOn();
    samsungLGTV.rollUp();
    samsungLGTV.fold();
    samsungLGTV.setVolume(75);
    System.out.println("SamsungLGTV Volume: " + samsungLGTV.getVolume());
    samsungLGTV.turnOff();
    samsungLGTV.rollDown();
    samsungLGTV.unfold();

    System.out.println();

    InnovationTV innovationTV = new InnovationTV();
    innovationTV.userGuide();
    innovationTV.turnOn();
    innovationTV.rollUp();
    innovationTV.fold();
    innovationTV.setVolume(50);
    System.out.println("SamsungLGTV Volume: " + samsungLGTV.getVolume());
    innovationTV.activeAI();
    innovationTV.deActiveAI();
    innovationTV.turnOff();
    samsungLGTV.rollDown();
    innovationTV.unfold();
  }
}
