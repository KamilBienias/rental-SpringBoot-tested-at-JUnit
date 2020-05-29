package pl.java4me.rentalSpringBoottestedatJUnit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Product;
import pl.java4me.rentalSpringBoottestedatJUnit.manager.ProductManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductApi {

    private ProductManager productManager;

    @Autowired
    public ProductApi(ProductManager productManager) {
        this.productManager = productManager;
    }

    @GetMapping("/get/all")
    public Iterable<Product> getAll(){
        return productManager.findAll();
    }

//    @GetMapping
//    public Optional<Product> getById(@RequestParam Long id){
//        return productManager.findById(id);
//    }

    @GetMapping("/get/{id}")
    public Optional<Product> getById(@PathVariable Long id){
        return productManager.findById(id);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productManager.save(product);
    }


//    @DeleteMapping
//    public void deleteProduct(@RequestParam Long id){
//        productManager.deleteById(id);
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        productManager.deleteById(id);
    }

    //cannot to be 2 PutMapping annotations at the same time, so below is the right one
//    @PutMapping
//    public Product updateProduct(@RequestBody Product product){
//        return productManager.save(product);
//    }

//    @PutMapping
//    public void assignProductToCustomer(@RequestParam Long idProduct, @RequestParam Long idCustomer){
//        productManager.addProductToCustomer(idProduct, idCustomer);
//    }

//    @PutMapping
//    public Product assignProductToCustomer(@RequestParam Long idProduct, @RequestParam Long idCustomer){
//        return productManager.addProductToCustomer(idProduct, idCustomer);
//    }

//    @PutMapping("/update/{idProduct}/{idCustomer}")
//    public Product assignProductToCustomer(@PathVariable Long idProduct, @PathVariable Long idCustomer){
//        return productManager.addProductToCustomer(idProduct, idCustomer);
//    }
}
