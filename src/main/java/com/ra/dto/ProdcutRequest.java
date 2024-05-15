package com.ra.dto;

import com.ra.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProdcutRequest {
    private int id;
    private String name;
    private double price;
    private int stock;
    private int categoryID;
    private boolean status;


}
