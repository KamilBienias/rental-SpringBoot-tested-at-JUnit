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

    @GetMapping("/get/{id}")
    public Optional<Product> getById(@PathVariable Long id){
        return productManager.findById(id);
    }

//    another way, using @RequestParam and then /api/products/get?id=3
//    @GetMapping("/get")
//    public Optional<Product> getById(@RequestParam Long id){
//        return productManager.findById(id);
//    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productManager.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        productManager.deleteById(id);
    }

//    another way, using @RequestParam and then /api/products/delete?id=2
//    @DeleteMapping("/delete")
//    public void deleteProduct(@RequestParam Long id){
//        productManager.deleteById(id);
//    }

//    these two methods don't work because of 1-way bindind (instead of 2-way binding)
//    @PutMapping("/update")
//    public Product assignProductToCustomer(@RequestParam Long idProduct, @RequestParam Long idCustomer){
//        return productManager.addProductToCustomer(idProduct, idCustomer);
//    }

//    @PutMapping("/update/{idProduct}/{idCustomer}")
//    public Product assignProductToCustomer(@PathVariable Long idProduct, @PathVariable Long idCustomer){
//        return productManager.addProductToCustomer(idProduct, idCustomer);
//    }
}
