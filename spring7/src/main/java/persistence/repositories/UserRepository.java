package persistence.repositories;

import persistence.entities.Order;
import persistence.entities.User;
import org.hibernate.Hibernate;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {
}
