package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
