package org.example.crm.service;

import org.example.crm.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ItemService {
    Item persistItem(Item item);
    List<Item> getItems();
    List<Item> getItemsByCategory(String category);
    Item getItemById(int id);
    void deleteItemById(int id);
    void updateItem(Item item);
}
