package com.example.utils;

public enum TestData {

    BASE_URL(PropertiesConfig.getInstance().getProperty("base.url")),
    LOGIN_URL(PropertiesConfig.getInstance().getProperty("login.url")),
    VALID_USERNAME(PropertiesConfig.getInstance().getProperty("valid.username")),
    VALID_PASSWORD(PropertiesConfig.getInstance().getProperty("valid.password"));

    private final String value;

    TestData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
