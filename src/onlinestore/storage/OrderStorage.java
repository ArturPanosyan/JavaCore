package onlinestore.storage;

import onlinestore.model.Order;
import onlinestore.model.Product;
import onlinestore.model.User;
import onlinestore.model.enums.OrderStatus;
import onlinestore.util.StorageSerializeUtil;


import java.io.Serializable;
import java.util.*;

public class OrderStorage implements Serializable {
    List<Order> orders = new LinkedList<>();

    public void add(Order order) {
        orders.add(order);
        StorageSerializeUtil.serializeOrderStorage(this);
    }

    public void print() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public Order getById(String id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public void printByUser(User currentUser) {
        for (Order order : orders) {
            if (order.getUser().equals(currentUser)) {
                System.out.println(order);
            }
        }
    }

    public void cancelOrderById(String orderId) throws Exception {
        boolean exist = false;
        for (Order order : orders) {
            if (order.getId().equals(orderId)) {
                order.setOrderStatus(OrderStatus.CANCELED);
                exist = true;
            }
        }
        if (!exist) {
            throw new Exception(orderId + " order Id does not found");
        }
    }

    public void productCart(Product product, String orderId) throws Exception {
        boolean exist = false;
        for (Order order : orders) {
            if (order.getId().equals(product)) {
                order.setOrderStatus(OrderStatus.CART);
                exist = true;
            }
        }
        if (!exist) {
            throw new Exception(orderId + " Product not found");
        }
    }


}

