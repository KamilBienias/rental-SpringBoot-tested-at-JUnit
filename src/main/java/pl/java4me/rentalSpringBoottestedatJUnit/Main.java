package pl.java4me.rentalSpringBoottestedatJUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Customer;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Product;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.repository.CustomerRepository;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.repository.ProductRepository;

import java.time.LocalDate;
import java.time.Month;

@Component
public class Main {

//    private CustomerRepository customerRepository;
//    private ProductRepository productRepository;

    @Autowired
    public Main(CustomerRepository customerRepository, ProductRepository productRepository) {
//        this.customerRepository = customerRepository;
//        this.productRepository = productRepository;
//    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDatabaseOfRental(){

        //first saves customers, because Customer is @OneToMany
        Customer customer1 = new Customer(1L, "James", "Bond", "67021957656", LocalDate.of(1967, Month.FEBRUARY,19));
        Customer customer2 = new Customer(2L, "Alfred", "Dawson", "34112568796", LocalDate.of(1996, Month.NOVEMBER,12));
        customerRepository.save(customer1);
        customerRepository.save(customer2);

        //then saves products, because Product is @ManyToOne
        Product product1 = new Product(1L, "latarka", 2015, 13);
        Product product2 = new Product(2L, "krzesło", 2003, 45);
        Product product3 = new Product(3L, "aparat fotograficzny", 2009, 129);

        //these 3 lines caused nested error while using api
//        product1.setCustomer(customer2);
//        product2.setCustomer(customer2);
//        product3.setCustomer(customer1);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
    }
}
