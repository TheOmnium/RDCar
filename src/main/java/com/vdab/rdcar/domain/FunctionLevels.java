package com.vdab.rdcar.domain;

import lombok.Getter;

@Getter
public enum FunctionLevels {

    A(2, "2"),
    B(3, "3"),
    C(4, "4"),
    D(5, "5"),
    E(6, "6"),
    F(7, "6+");

    private final Integer Id;
    private final String name;

    FunctionLevels(Integer id, String name) {
        Id = id;
        this.name = name;
    }
}
