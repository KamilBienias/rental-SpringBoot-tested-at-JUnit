package pl.java4me.rentalSpringBoottestedatJUnit.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.java4me.rentalSpringBoottestedatJUnit.dao.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
