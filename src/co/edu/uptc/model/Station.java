package co.edu.uptc.model;

import java.util.List;

public class Station {

    private String name;
    private List<ProductCategory> assignedCategories;
    private List<Order> orders;


    public Station(String name, List<ProductCategory> assignedCategories, List<Order> orders) {
        this.name = name;
        this.assignedCategories = assignedCategories;
        this.orders = orders;
    }

    public boolean manageCategories() {
        // Implementation for managing categories
        return true;
    }

    public void addOrder(Order order) {
        // Implementation for adding an order
    }

    public void finishOrder(Order order) {
        // Implementation for finishing an order
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductCategory> getAssignedCategories() {
        return assignedCategories;
    }

    public void setAssignedCategories(List<ProductCategory> assignedCategories) {
        this.assignedCategories = assignedCategories;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
