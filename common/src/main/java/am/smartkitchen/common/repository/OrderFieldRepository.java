package am.smartkitchen.common.repository;

import am.smartkitchen.common.entity.OrderField;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderFieldRepository extends JpaRepository<OrderField, Long> {
}
