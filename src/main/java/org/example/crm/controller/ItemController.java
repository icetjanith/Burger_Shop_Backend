package org.example.crm.controller;

import org.example.crm.model.Item;
import org.example.crm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/item")
    Item persistItem(@RequestBody Item item) {

        return itemService.persistItem(item);
    }
}
