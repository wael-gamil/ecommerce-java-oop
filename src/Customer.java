public class Customer {
  private String name;
  private double money;

  public Customer(String name, double money){
    this.name = name;
    this.money = money;
  }

  public boolean canAfford(double price){
    return money >= price;
  }

  public void buy(double price){
    money -= price;
  }

  public String getCustomerName(){
    return name;
  }
  public double getCustomerMoney(){
    return money;
  }
}
