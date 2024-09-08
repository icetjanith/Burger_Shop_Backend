package org.example.crm.service;

import org.example.crm.model.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    Item persistItem(Item item);
}
