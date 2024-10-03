package org.example.crm.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "Items")
public class Item {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String itemImage;
    private String itemName;
    private String itemCategory;
    private Double itemPrice;
    private Integer itemQuantity;
    private String itemExpiryDate;
    private String itemCode;

}
