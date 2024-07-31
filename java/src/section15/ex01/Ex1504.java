package section15.ex01;

class Customer {
  private int customerID;
  private String cutomerName;

  public int getCustomerID() {
    return this.customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getCutomerName() {
    return this.cutomerName;
  }

  public void setCutomerName(String cutomerName) {
    this.cutomerName = cutomerName;
  }

  @Override
  public int hashCode() {
    return customerID;
  }

}

public class Ex1504 {
  public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.setCustomerID(123);
    c1.setCutomerName("김일남");
    System.out.println(c1.hashCode());
  }
}
