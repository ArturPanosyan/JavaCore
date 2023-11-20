package onlinestore.storage;

import classwork.chapter12.User;
import onlinestore.model.Order;
import onlinestore.model.enums.OrderStatus;
import onlinestore.model.enums.UserType;
import onlinestore.util.StorageSerializeUtil;


import java.io.Serializable;
import java.util.*;

public class OrderStorage implements Serializable {
    List <Order> orders = new LinkedList();

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
}

