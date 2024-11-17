package com.kryprforge.database.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Accompaniment extends Product {
    @Column(name = "accompanimenttype", nullable = false)
    private String accompanimentType;

    public String getAccompanimentType() {
        return accompanimentType;
    }

    public void setAccompanimentType(String accompanimentType) {
        this.accompanimentType = accompanimentType;
    }
}
