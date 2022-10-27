package com.example.qlchuyenbay.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(ChungNhanPK.class)
@Table(name = "chungnhan")
public class ChungNhan implements Serializable {
    @Id
    @JoinColumn(name = "MaNV")
    @ManyToOne(fetch = FetchType.EAGER)
    private NhanVien maNV;

    @Id
    @JoinColumn(name = "MaMB", columnDefinition = "int")
    @ManyToOne(fetch = FetchType.LAZY)
    private MayBay maMB;

    public ChungNhan() {
    }

    public ChungNhan(MayBay mayBay, NhanVien nhanVien) {
        this.maMB = mayBay;
        this.maNV = nhanVien;
    }
}