package pl.java4me.rentalSpringBoottestedatJUnit.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
