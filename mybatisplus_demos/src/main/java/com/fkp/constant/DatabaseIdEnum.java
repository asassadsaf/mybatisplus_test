package com.fkp.constant;

import lombok.Getter;

@Getter
public enum DatabaseIdEnum {

    MYSQL("MySQL", "mysql"),
    SQLITE("SQLite", "sqlite");

    private final String productName;
    private final String flagName;

    DatabaseIdEnum(String productName, String flagName) {
        this.productName = productName;
        this.flagName = flagName;
    }
}
