package org.example.crm.service;

import org.example.crm.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    Item persistItem(Item item);
    List<Item> getItems();
}
