package com.bachhoanhanh.bai1.singleton;

public class Configuration {
    private static Configuration instance;
    private String dbUrl = "jdbc:mysql://localhost:3306/mydb";

    private Configuration() {}
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getDbUrl() { return dbUrl; }
}