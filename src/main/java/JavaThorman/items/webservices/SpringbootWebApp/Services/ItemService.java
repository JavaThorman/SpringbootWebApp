package JavaThorman.items.webservices.SpringbootWebApp.Services;

import JavaThorman.items.webservices.SpringbootWebApp.Models.Item;
import JavaThorman.items.webservices.SpringbootWebApp.Repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {




        private final ItemRepository itemRepository;

        public ItemService(ItemRepository itemRepository) {
            this.itemRepository = itemRepository;
        }

        public Item saveItem(Item item) {

            return itemRepository.save(item);
        }

        public List<Item> getAllItems() {
            return itemRepository.findAll();
        }

        public Optional<Item> getItemById(Long id) {
            return itemRepository.findById(id);
        }

        public Optional<Item> getItemByItemType(String itemType) {
            return itemRepository.findByItemType(itemType);
        }
    }

