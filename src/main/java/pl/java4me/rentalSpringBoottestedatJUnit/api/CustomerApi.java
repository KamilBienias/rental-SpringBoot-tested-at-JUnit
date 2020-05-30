package pl.java4me.rentalSpringBoottestedatJUnit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Customer;
import pl.java4me.rentalSpringBoottestedatJUnit.manager.CustomerManager;
import pl.java4me.rentalSpringBoottestedatJUnit.manager.ProductManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerApi {

    private CustomerManager customerManager;
    private ProductManager productManager;

    @Autowired
    public CustomerApi(CustomerManager customerManager, ProductManager productManager) {
        this.customerManager = customerManager;
        this.productManager = productManager;
    }

    @GetMapping("/get/all")
    public Iterable<Customer> getAll(){
        return customerManager.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Customer> getById(@PathVariable Long id){
        return customerManager.findById(id);
    }

//    another way, using @RequestParam and then /api/customers/get?id=2
//    @GetMapping("/get")
//    public Optional<Customer> getById(@RequestParam Long id){
//        return customerManager.findById(id);
//    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerManager.save(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerManager.deleteById(id);
    }

//    another way, using @RequestParam and then /api/customers/delete?id=2
//    @DeleteMapping("/delete")
//    public void deleteCustomer(@RequestParam Long id){
//        customerManager.deleteById(id);
//    }

    @PutMapping("/update")
    public Customer assignProductToCustomer(@RequestParam Long idProduct, @RequestParam Long idCustomer){
        return customerManager.addProductToCustomer(idProduct, idCustomer);
    }

//    another way, using @PathVariable then /api/customers/update/3/2
//    @PutMapping("/update/{idProduct}/{idCustomer}")
//    public Customer assignProductToCustomer(@PathVariable Long idProduct, @PathVariable Long idCustomer){
//        return customerManager.addProductToCustomer(idProduct, idCustomer);
//    }
}
