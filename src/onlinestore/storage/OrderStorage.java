package onlinestore.storage;

import onlinestore.order.Order;

public class OrderStorage {

    private Order[] orders = new Order[100];
    private int size;

    public void add(Order order){
        for (int i = 0; i < size; i++) {
            if(size == orders.length){
                extend();
            }
            orders[i] = order;
        }
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }


    public void changeOrderStatus(String orderStatus){
        for (int i = 0; i < size; i++) {
            if(orders[i].getId().equals(orderStatus)){
                System.out.println(orders[i]);
            }
        }
    }


    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders,0,tmp,0,orders.length);
        orders = tmp;
    }
}
