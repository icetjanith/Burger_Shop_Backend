package org.example.crm.repository;

import org.example.crm.entity.ItemEntity;
import org.example.crm.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface ItemRepository extends CrudRepository<ItemEntity, Integer> {
}
