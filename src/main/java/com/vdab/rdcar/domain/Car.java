package com.vdab.rdcar.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;


@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car implements Serializable {
    @Transient
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    private String category;
    @Transient
    private String brand;
    @Transient
    private String model;
    @Transient
    private String fuel;
    @Transient
    private Double listPrice;
    @Transient
    private Double upgradeAmount;
    @Transient
    private Double downgradeAmount;




}


