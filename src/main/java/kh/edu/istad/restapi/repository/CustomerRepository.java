package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
