package org.example.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.crm.model.Item;
import org.example.crm.repository.ItemRepository;
import org.example.crm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item persistItem(Item item) {

        return itemRepository.save(item);
    }

    @Override
    public List<Item> getItems() {

        return itemRepository.findAll();
    }

    @Override
    public List<Item> getItemsByCategory(String category) {
        return itemRepository.findByItemCategory(category);
    }

    @Override
    public Item getItemById(int id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteItemById(int id) {
        itemRepository.deleteById(id);
    }

    @Override
    public void updateItem(Item item) {
        itemRepository.save(item);
    }

}
