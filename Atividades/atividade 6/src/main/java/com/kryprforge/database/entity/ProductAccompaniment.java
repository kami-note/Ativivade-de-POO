package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_accompaniment")
public class ProductAccompaniment extends EntityBase {

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "accompaniment_id", referencedColumnName = "id", nullable = false)
    private Accompaniment accompaniment;

    public ProductAccompaniment() {}

    public ProductAccompaniment(Product product, Accompaniment accompaniment) {
        this.product = product;
        this.accompaniment = accompaniment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Accompaniment getAccompaniment() {
        return accompaniment;
    }

    public void setAccompaniment(Accompaniment accompaniment) {
        this.accompaniment = accompaniment;
    }
}
