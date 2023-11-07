package onlinestore.storage;

import classwork.chapter12.User;
import onlinestore.order.Order;
import onlinestore.order.OrderStatus;
import onlinestore.user.UserType;
import onlinestore.util.StorageSerializeUtil;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;

public class OrderStorage implements Serializable {

    private Order[] orders = new Order[100];
    private int size;

    public void add(Order order) {
        for (int i = 0; i < size; i++) {
            if (size == orders.length) {
                extend();
            }
            orders[size++] = order;
            StorageSerializeUtil.serializeOrderStorage(this);
        }
    }

    private void extend() {
        Order[] tmp = new Order[10];
        System.arraycopy(orders, 0, tmp, 0, orders.length);
        orders = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }


    public Order getById(String orderId) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(orderId)) {
                return orders[i];
            }
        }
        return null;
    }

    public void orderUuId() {
        String uuid = UUID.randomUUID().toString();
        String[] uuids = uuid.split("-");
        String id = uuids[0];
        System.out.println(id);
    }


    public Object statusDelivered(String user) {
        for (int i = 0; i < size; i++) {
            if (orders[i] instanceof Order) {
                Order order = (Order) orders[i];
                if (order.getUser().equals(user) && order.getOrderStatus() == OrderStatus.NEW) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(order.getDate());
                    calendar.add(Calendar.DAY_OF_MONTH, 9);
                    Date dateOfDelivered = calendar.getTime();
                    if (new Date().after(dateOfDelivered)) {
                        order.setOrderStatus(OrderStatus.DELIVERED);
                        int newStockQty = order.getProduct().getStockQty() - order.getQty();
                        order.getProduct().setStockQty(newStockQty);
                    }
                }
            }
        }
        return null;
    }

    public void cancelOrderById (String orderId) {
        for (int i = 0; i < size; i++) {
            if (orders[i] instanceof Order) {
                Order currentOrder = (Order) orders[i];
                if (currentOrder.getUser().equals(orderId)) {
                    if (currentOrder.getUserType(UserType.ADMIN)) {
                        System.out.println("Order Id: " + currentOrder.getOrderId() + " cancel Order");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }

    public void printCurrentOrders(User currentUser) {
        for (int i = 0; i < size; i++) {
            if (orders[i] instanceof Order) {
                Order currentOrder = (Order) orders[i];
                if (currentOrder.getUser().equals(currentUser)) {
                    if (currentOrder.isDelivered()) {
                        System.out.println("Order ID: " + currentOrder.getOrderId() + " - Delivered");
                    } else {
                        System.out.println("Order ID: " + currentOrder.getOrderId() + " - In Transit");
                        System.out.println("Current location: ");
                    }
                }
            }
        }
    }


}
