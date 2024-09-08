package org.example.crm.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Item {

    private Integer itemId;
    private String itemImage;
    private String itemName;
    private String itemCategory;
    private Double itemPrice;
    private Integer itemQuantity;
    private String itemExpiryDate;
    private String itemCode;

}
