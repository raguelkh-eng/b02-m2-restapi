package kh.edu.istad.restapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.resilience.annotation.EnableResilientMethods;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="m2_categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false)
    private String icon;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
