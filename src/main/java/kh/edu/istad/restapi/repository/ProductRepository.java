package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
