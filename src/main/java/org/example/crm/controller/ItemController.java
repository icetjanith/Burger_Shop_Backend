package org.example.crm.controller;

import org.example.crm.model.Item;
import org.example.crm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/item")
    Item persistItem(@RequestBody Item item) {

        return itemService.persistItem(item);
    }

    @GetMapping("/item")
    List<Item> getAllItems() {

        return itemService.getItems();
    }
}
