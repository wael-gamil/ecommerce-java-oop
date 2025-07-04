import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Product cheese = new Product("Cheese", 50, 3);
        ExpirableProduct biscuits = new ExpirableProduct("Biscuits", 75, 10, LocalDate.of(2025, 7, 4));
        ExpirableProduct expiredMilk = new ExpirableProduct("Milk", 20, 5, LocalDate.of(2023, 1, 1));
        ShippableProduct mobile = new ShippableProduct("Mobile", 500, 2, 0.2);
        ShippableProduct tv = new ShippableProduct("TV", 2000, 0, 5.0); 
        Product scratchCard = new Product("Scratch Card", 10, 100);

        Customer customer1 = new Customer("Mohamed", 10000);

        System.out.println("------ CASE 1: Successful Checkout with Shipping ------");
        Cart cart1 = new Cart();
        cart1.addProducts(cheese, 2);        
        cart1.addProducts(mobile, 1);         
        cart1.addProducts(biscuits, 1);       
        cart1.checkout(customer1);

        System.out.println("\n------ CASE 2: Out of Stock Error ------");
        Cart cart2 = new Cart();
        cart2.addProducts(tv, 1);
        cart2.checkout(customer1);

        System.out.println("\n------ CASE 3: Expired Product Error ------");
        Cart cart3 = new Cart();
        cart3.addProducts(expiredMilk, 1);
        cart3.checkout(customer1);

        System.out.println("\n------ CASE 4: Empty Cart Error ------");
        Cart cart4 = new Cart();
        cart4.checkout(customer1);

        System.out.println("\n------ CASE 5: Insufficient Balance ------");
        Customer brokeCustomer = new Customer("Ali", 50);
        Cart cart5 = new Cart();
        cart5.addProducts(mobile, 1); 
        cart5.checkout(brokeCustomer);

        System.out.println("\n------ CASE 6: Non-shippable Item Only ------");
        Customer scratchBuyer = new Customer("Sally", 100);
        Cart cart6 = new Cart();
        cart6.addProducts(scratchCard, 2);
        cart6.checkout(scratchBuyer);
    }
}
