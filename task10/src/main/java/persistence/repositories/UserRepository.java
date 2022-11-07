package persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import persistence.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}