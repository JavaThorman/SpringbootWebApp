package JavaThorman.items.webservices.SpringbootWebApp.Repository;
import JavaThorman.items.webservices.SpringbootWebApp.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Optional<Item> findByItemType(String itemType);
}
