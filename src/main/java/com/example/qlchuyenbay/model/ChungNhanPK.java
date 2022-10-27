package com.example.qlchuyenbay.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChungNhanPK implements Serializable {
    private String maNV;
    private int maMB;

    public ChungNhanPK() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}