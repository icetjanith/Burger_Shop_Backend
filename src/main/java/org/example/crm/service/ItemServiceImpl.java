package org.example.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.crm.entity.ItemEntity;
import org.example.crm.model.Item;
import org.example.crm.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item persistItem(Item item) {

        ItemEntity itemEntity = objectMapper.convertValue(item, ItemEntity.class);
        ItemEntity save = itemRepository.save(itemEntity);
        return objectMapper.convertValue(save, Item.class);

    }

    @Override
    public List<Item> getItems() {

        Iterable<ItemEntity> all = itemRepository.findAll();
        List<Item> items = new ArrayList<>();
        all.forEach(itemEntity -> {
            items.add(objectMapper.convertValue(itemEntity, Item.class));
        });
        return items;
    }

}
