package pl.java4me.rentalSpringBoottestedatJUnit.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String productName;
    private int yearOfProduction;
    private int price;

    //Needed for 2-way binding.
    //Product can be borrowed by only one customer,
    //so in this entity is generated foreign key
//    @ManyToOne
//    private Customer customer;

    public Product() {
    }

    public Product(Long id, String productName, int yearOfProduction, int price) {
        this.id = id;
        this.productName = productName;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

      //needed for 2-way binding
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return yearOfProduction == product.yearOfProduction &&
                price == product.price &&
                Objects.equals(id, product.id) &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, yearOfProduction, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                '}';
    }
}
