package JavaThorman.items.webservices.SpringbootWebApp.Repository;

import JavaThorman.items.webservices.SpringbootWebApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
