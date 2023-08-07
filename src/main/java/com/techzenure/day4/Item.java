package com.techzenure.day4;

class Item {
    String name;
    int price;
    int discount;

    public Item(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int calculateDiscountAmount() {
        return (price * discount) / 100;
    }
}
