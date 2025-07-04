import java.time.LocalDate;

public class ExpirableProduct extends Product {
  private LocalDate expDate;

  public ExpirableProduct(String name, double price, int quantity, LocalDate expDate){
    super(name,price,quantity);
    this.expDate = expDate;
  }
  @Override
  public boolean isExpired() {
    return expDate.isBefore(LocalDate.now());
  }
}
