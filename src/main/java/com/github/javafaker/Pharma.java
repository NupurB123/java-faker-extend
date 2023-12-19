package com.github.javafaker;

public class Pharma {

    private final Faker faker;

    protected Pharma(Faker faker) {
        this.faker = faker;
    }

    public String equipment() {
        return faker.fakeValuesService().resolve("pharma.equipment", this, faker);
    }
}
