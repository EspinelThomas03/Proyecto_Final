package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private List<Station> stations;
    private String orgerQueu;
    private List<Product> recordStack;

    public RestaurantManager() {
        this.stations = new ArrayList<>();
        this.orgerQueu = "";
        this.recordStack = new ArrayList<>();
    }

    public void addOrder(Order order) {
        // Implementation for adding an order to the queue
    }

    private void shareOrder(Order order) {
        // Implementation for sharing an order with relevant stations
    }

    public void finishOrder(Order order) {
        // Implementation for finishing an order and updating records
    }

}
