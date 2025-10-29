package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class RestaurantManager {

    private List<Station> stations;
    private Queue<Order> orderQueue;
    private Deque<Order> recordStack;

    public RestaurantManager() {
        this.stations = new ArrayList<>();
        this.orderQueue = new java.util.LinkedList<>();
        this.recordStack = new java.util.ArrayDeque<>();
        configureStations();
    }

    private void configureStations() {

    }

    public void addOrder(Order order) {
        orderQueue.add(order);
        shareOrder(order);
    }

    private void shareOrder(Order order) {
        for (Station station : stations) {
            for (ProductCategory category : station.getAssignedCategories()) {
                if (order.containsCategory(category)) {
                    station.addOrder(order);
                    break;
                }

            }
        }
    }

    public void finishOrder(Order order) {
        for (Order o : orderQueue) {
            if (o.getIdOrden().equalsIgnoreCase(order.getIdOrden())) {
                orderQueue.remove(o);
                notifyStations(order, order.getStationsInvolved());
                recordStack.push(o);
                break;
            }
        }
    }

    private void notifyStations(Order order, List<ProductCategory> categories) {
        for (Station station : stations) {
            for (ProductCategory category : categories) {
                if (station.getAssignedCategories().contains(category)) {
                    station.finishOrder(order);
                }
            }
        }
    }

}
