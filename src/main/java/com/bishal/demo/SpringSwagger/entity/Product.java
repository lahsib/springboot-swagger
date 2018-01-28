package com.bishal.demo.SpringSwagger.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Bishal Lama on 1/28/18.
 */
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    @ApiModelProperty(notes = "The database generated product ID")
    private Long id;

    @ApiModelProperty(notes = "The auto-generated version of the product")
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    @ApiModelProperty(notes = "The product description")
    private String description;

    @Column(name = "price")
    @ApiModelProperty(notes = "The price of the product", required = true)
    private Float price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
