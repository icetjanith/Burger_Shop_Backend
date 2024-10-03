package org.example.crm.controller;

import lombok.RequiredArgsConstructor;
import org.example.crm.model.Item;
import org.example.crm.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/saveitem")
    Item persistItem(@RequestBody Item item) {
        return itemService.persistItem(item);
    }

    @GetMapping("/all")
    List<Item> getAllItems() {
        return itemService.getItems();
    }

    @GetMapping("/searchitem/{id}")
    Item searchItem(@PathVariable int id) {
        return itemService.getItemById(id);
    }

    @GetMapping("/getitems/{category}")
    List<Item> getItemsByCategory(@PathVariable String category) {
        return itemService.getItemsByCategory(category);
    }

    @PutMapping("/updateitem")
    void updateItem(@RequestBody Item item) {
        itemService.updateItem(item);
    }

    @DeleteMapping("/deleteitem/{id}")
    void deleteItem(@PathVariable int id) {
        itemService.deleteItemById(id);
    }
}
