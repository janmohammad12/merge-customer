package com.example.demo.model;

import java.util.List;

public class CustomerDataBO {
    private String id;
    private String Customer_id;
    private List<String> packOne;
    private List<String> packTwo;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(String customer_id) {
        Customer_id = customer_id;
    }

    public List<String> getPackOne() {
        return packOne;
    }

    public void setPackOne(List<String> packOne) {
        this.packOne = packOne;
    }

    public List<String> getPackTwo() {
        return packTwo;
    }

    public void setPackTwo(List<String> packTwo) {
        this.packTwo = packTwo;
    }
}
