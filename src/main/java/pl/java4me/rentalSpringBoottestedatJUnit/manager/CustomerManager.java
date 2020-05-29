package pl.java4me.rentalSpringBoottestedatJUnit.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Product;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.repository.CustomerRepository;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Customer;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.repository.ProductRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerManager {

    private CustomerRepository customerRepository;
    private ProductRepository productRepository;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }

    public Customer addProductToCustomer(Long idProduct, Long idCustomer){
        Optional<Product> chosenProductOptional = productRepository.findById(idProduct);
        Optional<Customer> chosenCustomerOptional = customerRepository.findById(idCustomer);
        Product chosenProduct = chosenProductOptional.get();
        Customer chosenCustomer = chosenCustomerOptional.get();
//        List<Product> listOfProducts = new ArrayList<>();
        List<Product> listOfProducts = chosenCustomer.getProductList();
        listOfProducts.add(chosenProduct);
        chosenCustomer.setProductList(listOfProducts);
        return customerRepository.save(chosenCustomer);
    }
}
