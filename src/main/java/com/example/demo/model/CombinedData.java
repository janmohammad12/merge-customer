package com.example.demo.model;

import java.util.List;

public class CombinedData {
    private String id;
    private int customer_id;
    private List<String> pack1;
    private List<String> pack2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public List<String> getPack1() {
        return pack1;
    }

    public void setPack1(List<String> pack1) {
        this.pack1 = pack1;
    }

    public List<String> getPack2() {
        return pack2;
    }

    public void setPack2(List<String> pack2) {
        this.pack2 = pack2;
    }
}
