package am.smartkitchen.common.repository;

import am.smartkitchen.common.entity.ProductField;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFieldRepository extends JpaRepository<ProductField, Long> {
}
