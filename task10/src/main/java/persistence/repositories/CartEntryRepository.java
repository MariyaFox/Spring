package persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import persistence.entities.CartEntry;
import persistence.entities.Order;

import java.util.List;

public interface CartEntryRepository extends JpaRepository<Order, Long> {

}
