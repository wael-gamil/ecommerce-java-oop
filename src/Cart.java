import java.util.ArrayList;
import java.util.List;

public class Cart {
  private List<CartItem> items = new ArrayList<>();
  
  public void addProducts(Product product, int quantity){
    items.add(new CartItem(product, quantity));
  }

  public void checkout(Customer customer){
    if(isEmpty()){
      System.out.println("card is empty");
      return;
    }
    double subTotal = 0;
    double shippingCost = 0;
    List<Shippable> shipmentList = new ArrayList<Shippable>();
    for(CartItem item : items){
      Product product = item.product;
      if(item.quantity > product.getQuantity()){
        System.out.println("Not enough stock for: " + product.getProductName());
            return;
      }
      if(product.isExpired()){
        System.out.println("Product expired: " + product.getProductName());
            return;
      }
      subTotal += product.getPrice() * item.quantity;
      
      if(product instanceof Shippable shippable){
        shipmentList.add(shippable);
        shippingCost += shippable.getWeight();
      }
    }
    shippingCost *= 30;
    double total = subTotal + shippingCost;
    if (!customer.canAfford(total)) {
        System.out.println("Insufficient balance. You need: " + total);
        return;
    }

    customer.buy(total);
    if(!shipmentList.isEmpty()){
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        for (Shippable s : shipmentList) {
            System.out.printf("- %s %.1fg%n", s.getProductName(), s.getWeight() * 1000);
            totalWeight += s.getWeight();
        }
        System.out.printf("Total package weight: %.2f kg%n", totalWeight);
    }

    System.out.println("** Checkout receipt **");
    for (CartItem item : items) {
        System.out.printf("%dx %s %.2f%n", item.quantity, item.product.getProductName(), item.product.getPrice() * item.quantity);
    }
    System.out.println("----------------------");
    System.out.printf("Subtotal: %.2f%n", subTotal);
    System.out.printf("Shipping: %.2f%n", shippingCost);
    System.out.printf("Total Paid: %.2f%n", total);
    System.out.printf("Remaining Balance: %.2f%n", customer.getCustomerMoney());
  }

  public boolean isEmpty(){
    return items.isEmpty();
  }
}
