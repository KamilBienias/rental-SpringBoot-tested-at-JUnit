package pl.java4me.rentalSpringBoottestedatJUnit.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Customer;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.repository.CustomerRepository;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.repository.ProductRepository;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Product;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductManager {

    private ProductRepository productRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public ProductManager(ProductRepository productRepository, CustomerRepository customerRepository) {
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
    }

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

//    public void addProductToCustomer(Long idProduct, Long idCustomer){
//        Optional<Product> chosenProduct = productRepository.findById(idProduct);
//        Optional<Customer> chosenCustomer = customerRepository.findById(idCustomer);
//        chosenProduct.get().setCustomer(chosenCustomer.get());
//        productRepository.save(chosenProduct.get());
//    }

//    public Product addProductToCustomer(Long idProduct, Long idCustomer){
//        Optional<Product> chosenProductOptional = productRepository.findById(idProduct);
//        Optional<Customer> chosenCustomerOptional = customerRepository.findById(idCustomer);
//        Product chosenProduct = chosenProductOptional.get();
//        Customer chosenCustomer = chosenCustomerOptional.get();
//        chosenProduct.setCustomer(chosenCustomer);
//        return productRepository.save(chosenProduct);
//    }

//    public Product addProductToCustomer(Long idProduct, Long idCustomer){
//        Optional<Product> chosenProductOptional = productRepository.findById(idProduct);
//        Optional<Customer> chosenCustomerOptional = customerRepository.findById(idCustomer);
//        Product chosenProduct = chosenProductOptional.get();
//        Customer chosenCustomer = chosenCustomerOptional.get();
//        chosenProduct.setCustomer(chosenCustomer);
//        return productRepository.save(chosenProduct);
//    }
}
