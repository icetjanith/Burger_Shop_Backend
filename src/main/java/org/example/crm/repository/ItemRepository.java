package org.example.crm.repository;

import org.example.crm.entity.ItemEntity;
import org.example.crm.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findByItemCategory(String itemCategory);
}
