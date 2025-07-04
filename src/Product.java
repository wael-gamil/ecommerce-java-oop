public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  } 
  public String getProductName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }

  public boolean isExpired() {
    return false;
  }
  public boolean requiresShipping() {
    return false;
  }
  public double getWeight(){
    return 0;
  }
}
