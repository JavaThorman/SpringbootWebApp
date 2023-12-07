package JavaThorman.items.webservices.SpringbootWebApp.Controller;



import JavaThorman.items.webservices.SpringbootWebApp.Models.Item;
import JavaThorman.items.webservices.SpringbootWebApp.Services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {


    private final ItemService itemService;

    @PostMapping("")
    public ResponseEntity<Item> addItem(
            @RequestBody Item item
    ){
        Item newItem = itemService.saveItem(item);

        return ResponseEntity.ok(newItem);
    }

    @GetMapping("")
    public ResponseEntity<List<Item>> getItems () {

        return ResponseEntity.ok(itemService.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getOneItem(
            @PathVariable Long id
    ) {


        Optional<Item> item = itemService.getItemById(id);

        return ResponseEntity.ok(item.orElse(null));
    }


    @GetMapping("/item/{itemType}")
    public ResponseEntity<Item> getOneItemByItemType(
            @PathVariable String itemType
    ) {
        Optional<Item> item = itemService.getItemByItemType(itemType);

        return ResponseEntity.ok(item.orElse(null));
    }
}
