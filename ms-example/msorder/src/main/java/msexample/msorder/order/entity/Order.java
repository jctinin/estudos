package msexample.msorder.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String product;
  private int quantity;
  private boolean paid;
  public long getId() {
    return id;
  }

  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public boolean isPaid() {
    return paid;
  }
  public void setPaid(boolean paid) {
    this.paid = paid;
  }



}
