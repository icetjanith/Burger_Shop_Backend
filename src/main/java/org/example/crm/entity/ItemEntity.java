package org.example.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Items")
public class ItemEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String itemImage;
    private String itemName;
    private String itemCategory;
    private Integer itemPrice;
    private Integer itemQuantity;
    private String itemExpiryDate;
    private String itemCode;
}
