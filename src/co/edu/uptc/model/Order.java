package co.edu.uptc.model;

import java.util.List;

public class Order {

    private String table;
    private List<Product> products;
    private Boolean isReady;
    private long time;
    private List<String> stationsInvolved;

    public Order(String table, List<Product> products, Boolean isReady, long time, List<String> stationsInvolved) {
        this.table = table;
        this.products = products;
        this.isReady = isReady;
        this.time = time;
        this.stationsInvolved = stationsInvolved;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Boolean getIsReady() {
        return isReady;
    }

    public void setIsReady(Boolean isReady) {
        this.isReady = isReady;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<String> getStationsInvolved() {
        return stationsInvolved;
    }

    public void setStationsInvolved(List<String> stationsInvolved) {
        this.stationsInvolved = stationsInvolved;
    }
}
