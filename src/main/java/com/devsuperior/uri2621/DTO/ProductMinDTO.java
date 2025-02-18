package com.devsuperior.uri2621.DTO;

import com.devsuperior.uri2621.projections.ProductMinProjection;
import org.hibernate.criterion.Projection;

public class ProductMinDTO {

    private String name;

    public ProductMinDTO() {
    }

    public ProductMinDTO(String name) {
        this.name = name;
    }

    public ProductMinDTO(ProductMinProjection projection) {
        name = projection.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductMinDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
