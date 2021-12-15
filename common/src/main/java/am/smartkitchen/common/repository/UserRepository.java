package am.smartkitchen.common.repository;

import am.smartkitchen.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
